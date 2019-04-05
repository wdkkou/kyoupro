import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wmax = sc.nextInt();
        long[] w = new long[n];
        long[] v = new long[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }

        long[][] dp = new long[n + 1][wmax + 1];
        for (int i = 1; i <= n; i++) {
            for (int wsum = 0; wsum <= wmax; wsum++) {
                if (wsum - w[i - 1] >= 0) {
                    dp[i][wsum] =
                        Math.max(dp[i][wsum], dp[i - 1][wsum - (int) w[i - 1]] + v[i - 1]);
                }
                dp[i][wsum] = Math.max(dp[i][wsum], dp[i - 1][wsum]);
            }
        }
        System.out.println(dp[n][wmax]);
    }
}
