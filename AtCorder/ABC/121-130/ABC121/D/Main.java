import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long div = 2;
        long ans = 0;
        while (div <= 64) {
            long cnt1 = (a + 1) / div;
            long cnt2 = (b + 1) / div;
            long res = cnt2 - cnt1;
            System.out.println("res " + res);
            if (res == 0) {
                ans += 0;
            } else if (res % 2 != 0) {
                ans += (div / 2) * 1;
            }
            div *= 2;
            System.out.println("ans " + ans);
            System.out.println();
        }
        System.out.println(ans);
    }
}
