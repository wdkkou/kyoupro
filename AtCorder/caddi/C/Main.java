import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();

        long ans = 1;
        if(n == 1){
            System.out.println(p);
            return;
        }
        for (long i = 2; Math.pow(i, n) <= p; i++) {
            long x = p;
            long cnt = 0;
            while (x % i == 0) {
                x /= i;
                cnt++;
                if (cnt >= n) {
                    ans = Math.max(ans, i);
                    break;
                }
            }
            if (cnt >= n) {
                ans = Math.max(ans, i);
            } else {
                ans = Math.max(ans, 1);
            }
        }
        System.out.println(ans);
    }
}
