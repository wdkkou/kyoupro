import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean t = false;
        int start = 0;
        int ts = 0;
        int te = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'T') {
                cnt++;
            }
        }
        cnt -= 2;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'T') {
                ts = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'T') {
                te = i;
                break;
            }
        }
        if (ts == te) {
            System.out.println(s);
            System.out.println(0);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (ts <= i && i <= te) {
                continue;
            }
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println(te - ts - 1 - cnt);
    }
}
