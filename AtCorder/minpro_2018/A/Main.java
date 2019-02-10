import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.charAt(0) == 'y' && s.charAt(1) == 'a' && s.charAt(2) == 'h'
            && s.charAt(3) == s.charAt(4)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
