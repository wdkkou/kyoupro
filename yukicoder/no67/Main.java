import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] l = new long[n];
        long max = 0;
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextLong();
            max = Math.max(max, l[i]);
        }
        long k = sc.nextLong();
        // System.out.println(Arrays.toString(l));
        double ans = binSearch(0, (double) max + 1, k, l, n);
        // System.out.println(ans);
        System.out.printf("%.12f%n", ans);
    }
    public static double binSearch(double ok, double ng, long k, long[] l, int n) {
        for (int i = 0; i < 100; i++) {
            double mid = (ok + ng) / 2.0;
            // System.out.printf("ok = %f%n", ok);
            // System.out.printf("ng = %f%n", ng);
            // System.out.printf("mid = %f%n", mid);
            if (solve(mid, k, l, n)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
    public static boolean solve(double x, long k, long[] l, int n) {
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += l[i] / x;
        }
        if (cnt < k) {
            return false;
        }
        return true;
    }
}
