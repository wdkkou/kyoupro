import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = 0;
        if (a + c <= t) {
            System.out.println(b + d);
        } else if (c <= t) {
            System.out.println(d);
        } else if (a <= t) {
            System.out.println(b);
        } else {
            System.out.println(0);
        }
    }
}
