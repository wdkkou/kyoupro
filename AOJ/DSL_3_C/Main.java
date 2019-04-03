import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long[] x = new long[q];
        for (int i = 0; i < q; i++) {
            x[i] = sc.nextLong();
        }

        long[] ans = new long[q];
        for (int i = 0; i < q; i++) {
            ans[i] = syakutori(a, x[i], n);
        }
        for (int i = 0; i < q; i++) {
            System.out.println(ans[i]);
        }
    }

    public static long syakutori(long[] a, long x, int n) {
        int right = 0;
        long res = 0;
        long sum = 0;
        for (int left = 0; left < n; left++) {
            while (right < n && sum + a[right] <= x) {
                // System.out.printf("left = %d,right = %d %n", left, right);
                // System.out.printf("a[%d] = %d %n", right, a[right]);
                sum += a[right];
                // System.out.printf("sum = %d %n", sum);
                right++;
            }
            // System.out.printf(" over left = %d,right = %d %n", left, right);
            res += Math.max(0, right - left);
            sum -= a[left];
        }
        return res;
    }
}
