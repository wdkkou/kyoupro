import java.util.Scanner;
import java.util.*;

public class Main {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int x = Integer.parseInt(n);
        dfs("", n.length(), x);
        System.out.println(cnt);
    }
    public static void dfs(String s, int len, int n) {
        if (s.length() > len) {
            return;
        }
        if (s.length() != 0) {
            if (check(s) && Integer.parseInt(s) <= n) {
                // System.out.println(s);
                cnt++;
            }
        }
        dfs(s + "3", len, n);
        dfs(s + "5", len, n);
        dfs(s + "7", len, n);
        return;
    }
    public static boolean check(String s) {
        boolean ok3 = false;
        boolean ok5 = false;
        boolean ok7 = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '3') {
                ok3 = true;
            } else if (s.charAt(i) == '5') {
                ok5 = true;
            } else if (s.charAt(i) == '7') {
                ok7 = true;
            } else {
                return false;
            }
        }
        if (ok3 && ok5 && ok7) {
            return true;
        }
        return false;
    }
}
