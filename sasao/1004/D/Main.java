import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double x = 30.0000 * n + 0.5000 * m;
        double y = 6.0000 * m;
        if (x > 360) {
            x -= 360;
        }
        double ans = Math.abs(x - y);
        System.out.printf("%.4f%n", ans);
    }
}
