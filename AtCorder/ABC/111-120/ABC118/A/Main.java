import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean ok = false;
        if (b % a == 0) {
            ok = true;
        }
        if (ok) {
            System.out.println(a + b);
            return;
        }
        System.out.println(b - a);
    }
}
