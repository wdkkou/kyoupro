import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String x = "A?KIHA?BA?RA?";
        if (s.matches(x)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
