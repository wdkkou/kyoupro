import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String ans = sb.replace(i, j, "").toString();
                if (ans.equals("keyence")) {
                    System.out.println("YES");
                    return;
                }
                sb = new StringBuilder(s);
            }
        }
        System.out.println("NO");
    }
}
