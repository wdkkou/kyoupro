import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int max = Character.getNumericValue(n.charAt(0));
        int sum = 0;
        for (int i = 0; i < n.length() - 1; i++) {
            sum += max;
            sum *= 10;
        }
        sum += max;
        if (Integer.parseInt(n) <= sum) {
            System.out.println(sum);
            return;
        }
        max++;
        System.out.println(max * 100 + max * 10 + max);
    }
}
