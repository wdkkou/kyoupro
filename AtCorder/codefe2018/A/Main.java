import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Map<Integer, Long>> load = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int l = sc.nextInt();

            if (!load.containsKey(a)) {
                Map<Integer, Long> loadMap = new TreeMap<>();
                load.put(a, loadMap);
            }
            if (!load.get(a).containsKey(l)) {
                load.get(a).put(l, 0L);
            }
            load.get(a).put(l, load.get(a).get(l) + 1);

            if (!load.containsKey(b)) {
                Map<Integer, Long> loadMap = new TreeMap<>();
                load.put(b, loadMap);
            }
            if (!load.get(b).containsKey(l)) {
                load.get(b).put(l, 0L);
            }
            load.get(b).put(l, load.get(b).get(l) + 1);
        }


        long ans = 0;
        for (int i = 0; i < n; i++) {
            long cnt = 0;
            for (Integer key : load.get(i).keySet()) {
                if (key == 1270) {
                    long cnt1 = load.get(i).get(key);
                    cnt += cnt1 * (cnt1 - 1) / 2;
                    continue;
                }
                if (key > 1270) {
                    continue;
                }
                long cnt1 = load.get(i).get(key);
                long cnt2 = 0;
                if (!load.get(i).containsKey(2540 - key)) {
                    cnt2 = 0;
                } else {
                    cnt2 = load.get(i).get(2540 - key);
                }
                cnt += cnt1 * cnt2;
            }
            ans += cnt;
        }
        System.out.println(ans);
    }
}
