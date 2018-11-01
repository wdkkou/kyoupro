import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        List<Integer> rs = new ArrayList<>();
        List<Integer> rt = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            rs.add(-1);
            rt.add(-1);
        }

        boolean ok = true;
        for (int i = 0; i < s.length(); i++) {
            int s_i = s.charAt(i) - 'a';
            int t_i = t.charAt(i) - 'a';
            if (rs.get(s_i) >= 0) {
                if (rs.get(s_i) != t_i) {
                    ok = false;
                    break;
                }
            }
            if (rt.get(t_i) >= 0) {
                if (rt.get(t_i) != s_i) {
                    ok = false;
                    break;
                }
            }
            if (rs.get(s_i) < 0) {
                rs.set(s_i, t_i);
            }
            if (rt.get(t_i) < 0) {
                rt.set(t_i, s_i);
            }
        }

        if (ok) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
