import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int[] cnt = new int[n];
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                cnt[i]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (b.charAt(i) == c.charAt(i)) {
                cnt[i]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (c.charAt(i) == a.charAt(i)) {
                cnt[i]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (cnt[i] >= 3) {
                continue;
            }
            if (cnt[i] == 0) {
                ans += 2;
                continue;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
