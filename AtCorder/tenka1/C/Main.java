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
        int m = n / 2;
        if (n % 2 == 0) {
            m = n / 2 - 1;
        }

        long ans = 0;
        for (int i = 0; i < m; i++) {
            long min = a[i];
            if (i % 2 == 1) {
            }
            ans += Math.abs(max - a[i]) + Math.abs(max - a[i + 1]);
            System.out.println("max = " + max);
            System.out.printf(" %d %d %n", a[i], a[i + 1]);
        }
        System.out.println(ans);
    }
}
