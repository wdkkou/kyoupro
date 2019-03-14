import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int num = Math.min(a, b);
        int cnt = 0;
        while (true) {
            if (a % num == 0 && b % num == 0) {
                cnt++;
            }
            if (cnt == k) {
                System.out.println(num);
                return;
            }
            num--;
        }
    }
}
