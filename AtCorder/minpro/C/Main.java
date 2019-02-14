import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = a + (b - a) * ((k - a + 1) / 2) + (k - a + 1) % 2;
        ans = Math.max(k + 1, ans);
        System.out.println(ans);
    }
}
