import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long k = sc.nextLong();
        long t = 1;
        for (int i = 0; i < k; i++) {
            t *= 10;
        }
        long ans = (x + t) / t * t;
        System.out.println(ans);
    }
}
