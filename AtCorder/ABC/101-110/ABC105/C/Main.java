import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2 == 0 ? 0 : 1);
            n -= Math.abs(n % 2);
            n /= -2;
        }
        if (sb.length() == 0) {
            sb.append(0);
        }
        System.out.println(sb.reverse().toString());
    }
}
