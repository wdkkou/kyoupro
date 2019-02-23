import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Map<Integer, Integer> l = new HashMap<>();
        Map<Integer, Integer> r = new HashMap<>();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            if (l.containsKey(x)) {
                l.put(x, 0);
            }
            l.put(x, l.get(x) + 1);
            int y = sc.nextInt();
            if (r.containsKey(y)) {
                r.put(y, 0);
            }
            r.put(y, r.get(x) + 1);
        }
        String ans = "";
        if (l.get(1) % 2 == 0) {
            ans += "0";
        } else {
            ans += "1";
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == '0') {
            }
        }
    }
}
