import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long k = sc.nextLong();
        long ans = x;
        if (k == 0) {
            ans++;
            System.out.println(ans);
            return;
        }
        long l = (long) Math.pow(10, k);
        ans /= l;
        ans++;
        ans *= l;
        System.out.println(ans);
    }
}
