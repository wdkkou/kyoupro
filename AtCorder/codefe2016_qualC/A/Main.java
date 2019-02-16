import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean c = false;
        int ci = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'C') {
                c = true;
                ci = i;
                break;
            }
        }
        boolean f = false;
        int fi = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'F') {
                f = true;
                fi = i;
                break;
            }
        }
        if (!(c && f)) {
            System.out.println("No");
            return;
        }
        if (ci > fi) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
