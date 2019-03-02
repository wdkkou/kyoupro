import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for (int i = 0; i + 2 <= n; i++) {
            String str = s.substring(i, i + 2);
            if (str.equals("AC")) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
