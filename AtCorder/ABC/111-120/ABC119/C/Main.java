import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        Collections.sort(a);
        long ans = gcd(a.get(0), a.get(1));
        for (int i = 2; i < n; i++) {
            ans = gcd(ans, a.get(i));
        }
        System.out.println(ans);
    }
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
