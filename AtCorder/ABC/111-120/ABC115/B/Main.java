import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int min = 1000;
        for (int i = 0; i < s.length() - 2; i++) {
            min = Math.min(calc(s.charAt(i), s.charAt(i + 1), s.charAt(i + 2)), min);
        }
        System.out.println(min);
    }
    public static int calc(char x, char y, char z) {
        int a = 100 * Character.getNumericValue(x) + 10 * Character.getNumericValue(y)
            + Character.getNumericValue(z);
        return Math.abs(753 - a);
    }
}
