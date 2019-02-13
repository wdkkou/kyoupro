import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() < 4) {
            System.out.println("No");
            return;
        }
        String y = s.substring(0, 4);
        if (y.equals("YAKI")) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
