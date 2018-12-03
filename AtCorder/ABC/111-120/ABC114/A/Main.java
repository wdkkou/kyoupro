import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 7 || n == 5 || n == 3) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
