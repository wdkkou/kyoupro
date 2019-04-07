import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextLong();
        long h = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        long x = Math.min(d, Math.min(s * 2, Math.min(h * 4, q * 8)));
        long y = Math.min(s, Math.min(h * 2, q * 4));
        long amari = n % 2;
        //System.out.printf("x %d,y %d,amari %d%n", x, y, amari);
        if (amari == 0) {
            System.out.println(n / 2 * x);
            return;
        }
        System.out.println(n / 2 * x + amari * y);
    }
}
