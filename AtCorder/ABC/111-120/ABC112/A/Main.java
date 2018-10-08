import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
            return;
        }
        if (n == 2) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
            return;
        }
    }
}
