import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        int cnt = 0;
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = l.get(i) + l.get(j);
            if (j >= i) {
                break;
            }
            if (k <= c - 1) {
                j++;
                cnt++;
                continue;
            }
        }
        int ans = n - cnt;
        System.out.println(ans);
    }
}
