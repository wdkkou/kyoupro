import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            if (!map.containsKey(d)) {
                map.put(d, 0);
            }
            map.put(d, map.get(d) + 1);
        }
        int m = sc.nextInt();
        List<Integer> t = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            t.add(sc.nextInt());
        }

        boolean ok = true;
        for (int i = 0; i < m; i++) {
            int x = t.get(i);
            if (!map.containsKey(x) || map.get(x) == 0) {
                ok = false;
                break;
            }
            map.put(x, map.get(x) - 1);
        }

        if (ok) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
