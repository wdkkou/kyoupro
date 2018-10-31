import java.util.*;
public class Main {
    static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        List<Long> factorial = new ArrayList<>();
        factorial.add(1L);
        List<Long> inverse = new ArrayList<>();
        inverse.add(1L);
        for (int i = 1; i <= h + w - 2; i++) {
            factorial.add(factorial.get(i - 1) * i % MOD);
            inverse.add(pow(factorial.get(i), MOD - 2) % MOD);
        }
        long ans = 0;
        for (int i = (int) b; i < w; i++) {
            long tmp1 = combine(h - a - 1 + i, i, factorial, inverse);
            long tmp2 = combine(a - 1 + w - i - 1, a - 1, factorial, inverse);
            ans += tmp1 * tmp2;
            ans %= MOD;
        }
        System.out.println(ans);
    }

    public static long pow(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return ans;
    }

    public static long combine(long n, long k, List<Long> factorial, List<Long> inverse) {
        return factorial.get((int) n) * inverse.get((int) k) % MOD * inverse.get((int) n - (int) k)
            % MOD;
    }
}
