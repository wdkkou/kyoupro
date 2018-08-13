import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        List<Long> sum = new ArrayList<>();
        long total = 0;
        sum.add(total);
        for (Long it : a) {
            total += it;
            sum.add(total);
        }
        Map<Long, Long> map = new HashMap<>();
        for (Long it : sum) {
            long amari = it % m;
            if (map.containsKey(amari)) {
                map.put(amari, map.get(amari) + 1L);
                continue;
            }
            map.put(amari, 1L);
        }
        long ans = 0;
        for (Long key : map.keySet()) {
            long num = map.get(key);
            ans += num * (num - 1) / 2;
        }
        System.out.println(ans);
    }
}
