import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        for (int b = 1; b <= n; b++) {
            int p = n / b;
            int r = n % b;
            ans += p * Math.max(b - k, 0);
            ans += Math.max(r - k + 1, 0);
        }
        if (k == 0) {
            ans -= n;
        }
        System.out.println(ans);
    }
}
