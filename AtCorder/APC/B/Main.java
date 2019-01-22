import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += b[i] - a[i];
        }

        long cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                cnt += (b[i] - a[i] + 1) / 2;
            }
        }
        if (cnt <= sum) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
