import java.util.Scanner;
import java.util.*;
public class Main {
    static int[] f = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    static int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -INF);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                if (i - f[a.get(j)] < 0) {
                    continue;
                }
                dp[i] = Math.max(dp[i - f[a.get(j)]] + 1, dp[i]);
            }
        }

        int remain = dp[n];
        int match = n;
        String ans = "";
        while (match > 0) {
            for (int i = m - 1; i >= 0; i--) {
                if (match - f[a.get(i)] < 0) {
                    continue;
                }
                if (dp[match - f[a.get(i)]] == remain - 1) {
                    remain--;
                    match -= f[a.get(i)];
                    ans += String.valueOf(a.get(i));
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
