import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long cnt1 = 0;
        long cnt2 = 0;
        for (int i = 1; i <= n; i++) {
            if (k % 2 == 0) {
                if (i % k == 0) {
                    cnt1++;
                }
                if (i % k == k / 2) {
                    cnt2++;
                }
            } else if (k % 2 == 1) {
                if (i % k == 0) {
                    cnt1++;
                }
            }
        }
        long ans = cnt1 * cnt1 * cnt1 + cnt2 * cnt2 * cnt2;
        System.out.println(ans);
    }
}
