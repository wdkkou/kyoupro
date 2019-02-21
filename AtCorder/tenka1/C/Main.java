import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);

        long res1 = 0;
        long[] k = new long[n];
        res1 = solve(k, a, n, true);
        long res2 = 0;
        res2 = solve(k, a, n, false);

        long ans = Math.max(res1, res2);
        System.out.println(ans);
    }
    public static long solve(long[] k, long[] a, int n, boolean even) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                k[i] = 1;
            } else {
                k[i] = 2;
            }
            if (even) {
                if (i % 2 == 0) {
                    k[i] *= -1;
                } else if (i % 2 != 0) {
                    k[i] *= 1;
                }
            } else {
                if (i % 2 == 0) {
                    k[i] *= 1;
                } else if (i % 2 != 0) {
                    k[i] *= -1;
                }
            }
        }
        Arrays.sort(k);
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += k[i] * a[i];
        }
        return res;
    }
}
