import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] ch = {'S', 'W'};
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ans.setCharAt(0, ch[i]);
                ans.setCharAt(1, ch[j]);
                ans = solve(s, ans);
                if (check1(n, ans, s.charAt(n - 1)) && check2(n, ans, s.charAt(0))) {
                    System.out.println(ans);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    public static StringBuilder solve(String s, StringBuilder ans) {
        for (int i = 1; i < s.length() - 1; i++) {
            if (ans.charAt(i) == 'S') {
                if (s.charAt(i) == 'o' && ans.charAt(i - 1) == 'S') {
                    ans.setCharAt(i + 1, 'S');
                } else if (s.charAt(i) == 'x' && ans.charAt(i - 1) == 'W') {
                    ans.setCharAt(i + 1, 'S');
                } else if (s.charAt(i) == 'o' && ans.charAt(i - 1) == 'W') {
                    ans.setCharAt(i + 1, 'W');
                } else if (s.charAt(i) == 'x' && ans.charAt(i - 1) == 'S') {
                    ans.setCharAt(i + 1, 'W');
                }
            }
            if (ans.charAt(i) == 'W') {
                if (s.charAt(i) == 'o' && ans.charAt(i - 1) == 'S') {
                    ans.setCharAt(i + 1, 'W');
                } else if (s.charAt(i) == 'x' && ans.charAt(i - 1) == 'W') {
                    ans.setCharAt(i + 1, 'W');
                } else if (s.charAt(i) == 'o' && ans.charAt(i - 1) == 'W') {
                    ans.setCharAt(i + 1, 'S');
                } else if (s.charAt(i) == 'x' && ans.charAt(i - 1) == 'S') {
                    ans.setCharAt(i + 1, 'S');
                }
            }
        }
        return ans;
    }
    public static boolean check1(int n, StringBuilder ans, char ch) {
        if (ans.charAt(n - 1) == 'S') {
            if (ch == 'o' && ans.charAt(n - 2) == 'S' && ans.charAt(0) == 'S') {
                return true;
            } else if (ch == 'o' && ans.charAt(n - 2) == 'W' && ans.charAt(0) == 'W') {
                return true;
            } else if (ch == 'x' && ans.charAt(n - 2) == 'S' && ans.charAt(0) == 'W') {
                return true;
            } else if (ch == 'x' && ans.charAt(n - 2) == 'W' && ans.charAt(0) == 'S') {
                return true;
            } else {
                return false;
            }
        }
        if (ans.charAt(n - 1) == 'W') {
            if (ch == 'o' && ans.charAt(n - 2) == 'S' && ans.charAt(0) == 'W') {
                return true;
            } else if (ch == 'o' && ans.charAt(n - 2) == 'W' && ans.charAt(0) == 'S') {
                return true;
            } else if (ch == 'x' && ans.charAt(n - 2) == 'S' && ans.charAt(0) == 'S') {
                return true;
            } else if (ch == 'x' && ans.charAt(n - 2) == 'W' && ans.charAt(0) == 'W') {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean check2(int n, StringBuilder ans, char ch) {
        if (ans.charAt(0) == 'S') {
            if (ch == 'o' && ans.charAt(n - 1) == 'S' && ans.charAt(1) == 'S') {
                return true;
            } else if (ch == 'o' && ans.charAt(n - 1) == 'W' && ans.charAt(1) == 'W') {
                return true;
            } else if (ch == 'x' && ans.charAt(n - 1) == 'S' && ans.charAt(1) == 'W') {
                return true;
            } else if (ch == 'x' && ans.charAt(n - 1) == 'W' && ans.charAt(1) == 'S') {
                return true;
            } else {
                return false;
            }
        }
        if (ans.charAt(0) == 'W') {
            if (ch == 'o' && ans.charAt(n - 1) == 'S' && ans.charAt(1) == 'W') {
                return true;
            } else if (ch == 'o' && ans.charAt(n - 1) == 'W' && ans.charAt(1) == 'S') {
                return true;
            } else if (ch == 'x' && ans.charAt(n - 1) == 'S' && ans.charAt(1) == 'S') {
                return true;
            } else if (ch == 'x' && ans.charAt(n - 1) == 'W' && ans.charAt(1) == 'W') {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
