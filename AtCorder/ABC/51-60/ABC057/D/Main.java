import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        Map<Long, Long> v = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            long key = sc.nextLong();
            if (!v.containsKey(key)) {
                v.put(key, 0L);
            }
            v.put(key, v.get(key) + 1L);
        }

        double min = Double.MAX_VALUE;
        for (long i = a; i <= b; i++) {
            long x = 0;
            for (long j = 0; j <= i; j++) {
                x += v.get(j);
            }
            min = Math.min(min, x / i);
        }
        System.out.println(String.format("%.6f", min));
    }
}
