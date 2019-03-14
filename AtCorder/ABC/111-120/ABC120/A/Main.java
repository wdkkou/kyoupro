import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = b / a;
        if (cnt >= c) {
            System.out.println(c);
            return;
        }
        System.out.println(cnt);
    }
}
