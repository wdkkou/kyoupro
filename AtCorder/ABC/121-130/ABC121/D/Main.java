import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = calc(b) ^ calc(a - 1);
        System.out.println(ans);
    }
    public static long calc(long x) {
        if (x <= 0) {
            return 0;
        }
        x++;
        long ans = 0;
        for (int i = 0; i < 50; i++) {
            long loop = (1L << (i + 1));
            long cnt = (x / loop) * (loop / 2);
            cnt += Math.max(0, (x % loop) - (loop / 2));
            if (cnt % 2 == 1) {
                ans += (1L << i);
            }
        }
        return ans;
    }
}
