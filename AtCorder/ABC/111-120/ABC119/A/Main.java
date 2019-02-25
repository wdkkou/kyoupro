import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String k = s.substring(5, 7);
        int m = Integer.parseInt(k);
        if (m > 4) {
            System.out.println("TBD");
            return;
        }
        System.out.println("Heisei");
    }
}
