import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }

        int cnt = 0;
        int cnt2 = 0;
        boolean adj = false;
        for (int i = 0; i < n; i++) {
            if (p.get(i) == i + 1) {
                cnt++;
                if (adj) {
                    cnt2++;
                    adj = false;
                    continue;
                }
                adj = true;
                continue;
            }
            adj = false;
        }

        cnt -= 2 * cnt2;
        if (cnt <= 0) {
            cnt = 0;
        }
        int ans = cnt + cnt2;
        System.out.println(ans);
    }
}
