import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            x.add(sc.nextInt());
        }
        if (n >= m) {
            System.out.println(0);
            return;
        }
        Collections.sort(x);

        List<Integer> sub = new ArrayList<>();
        for (int i = 0; i < m - 1; i++) {
            int k = x.get(i + 1) - x.get(i);
            sub.add(k);
        }
        Collections.sort(sub);
        int ans = 0;
        int k = m - n;
        for (int i = 0; i < k; i++) {
            ans += sub.get(i);
        }
        System.out.println(ans);
    }
}
