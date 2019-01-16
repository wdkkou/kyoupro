import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = sc.nextLong();
        if (s == n) {
            System.out.println(n + 1);
            return;
        }
        for (long b = 2; b * b <= n; b++) {
            if (solve(n, s, b)) {
                System.out.println(b);
                return;
            }
        }
        boolean ok = false;
        long ans = 1000000000000L;
        for (long p = 1; p * p < n; p++) {
            long b = (n - s) / p + 1;
            // System.out.println("b = " + b);
            if (b < 2) {
                continue;
            }
            if (solve(n, s, b)) {
                ans = Math.min(ans, b);
                ok = true;
            }
        }
        if (!ok) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }
    public static boolean solve(long n, long s, long num) {
        long ans = 0;
        while (n > 0) {
            ans += n % num;
            n /= num;
        }
        if (ans == s) {
            return true;
        }
        return false;
    }
}
