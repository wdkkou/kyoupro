import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                if (a % 2 == 0) {
                    b += a / 2;
                    a = a / 2;
                } else {
                    a--;
                    b += a / 2;
                    a = a / 2;
                }
            } else {
                if (b % 2 == 0) {
                    a += b / 2;
                    b = b / 2;
                } else {
                    b--;
                    a += b / 2;
                    b = b / 2;
                }
            }
        }
        System.out.printf("%d %d%n", a, b);
    }
}
