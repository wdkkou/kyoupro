import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        List<Long> h = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            h.add(sc.nextLong());
        }
        long ok = 1000000000;
        long ng = 0;
        while (Math.abs(ok - ng) > 1) {
            long mid = (ok + ng) / 2;
            if (solve(h, mid, a, b)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        System.out.println(ok);
    }
    public static boolean solve(List<Long> h, long t, long a, long b) {
        long ans = 0;
        for (long hi : h) {
            if (hi - b * t <= 0) {
                continue;
            }
            if ((hi - b * t) % (a - b) == 0) {
                ans += (hi - b * t) / (a - b);
                continue;
            }
            ans += (hi - b * t) / (a - b) + 1;
        }
        if (ans <= t) {
            return true;
        }
        return false;
    }
}
