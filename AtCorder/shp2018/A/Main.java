import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long c = sc.nextLong();
        long d = sc.nextLong();
        long left = 140;
        long right = 170;
        long ans = 0;
        while (true) {
            if (d < left) {
                break;
            }
            long min = Math.max(left, c);
            long max = Math.min(right, d);
            ans += Math.max(max - min, 0);
            left *= 2;
            right *= 2;
        }
        System.out.println(ans);
    }
}
