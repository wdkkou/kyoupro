import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long X = sc.nextLong();
        List<Long> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextLong());
        }
        long d = Math.abs(X - x.get(0));
        for (int i = 1; i < n; i++) {
            d = gcd(d, Math.abs(X - x.get(i)));
        }

        System.out.println(d);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
