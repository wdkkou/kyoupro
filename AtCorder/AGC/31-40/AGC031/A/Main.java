import java.util.*;
public class Main {
    static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        long ans = n;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)){
            }
        }
        System.out.println(ans);
    }
    public static boolean solve(String b) {
        boolean ok = true;
        if (b.length() == 1) {
            return true;
        }
        List<Character> list = new ArrayList<>();
        list.add(b.charAt(0));
        for (int i = 1; i < b.length(); i++) {
            if (list.contains(b.charAt(i))) {
                ok = false;
                break;
            }
            list.add(b.charAt(i));
        }
        return ok;
    }
}
