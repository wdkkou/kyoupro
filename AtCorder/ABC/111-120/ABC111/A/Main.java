import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            int x = n % 10;
            n /= 10;
            if (x == 9) {
                num[i] = 1;
                continue;
            }
            if (x == 1) {
                num[i] = 9;
                continue;
            }
        }
        System.out.println(num[2] * 100 + num[1] * 10 + num[0]);
    }
}
