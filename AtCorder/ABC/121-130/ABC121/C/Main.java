import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Long, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + b);
                continue;
            }
            map.put(a, b);
        }
        long cnt = 0;
        long ans = 0;
        long k = 0;
        for (Long key : map.keySet()) {
            cnt += map.get(key);
            ans += key * map.get(key);
            if (cnt >= m) {
                k = key;
                break;
            }
        }

        ans -= k * (cnt - m);
        System.out.println(ans);
    }
}
