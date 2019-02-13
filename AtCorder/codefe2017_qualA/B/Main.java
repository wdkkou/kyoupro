import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        for (long i = 0; i <= n; i++) {
            for (long j = 0; j <= m; j++) {
                if (i * (m - j) + j * (n - i) == k) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
