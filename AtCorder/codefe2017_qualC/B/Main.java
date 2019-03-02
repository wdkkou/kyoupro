import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int all = 1;
        int bad = 1;
        for (int i = 0; i < n; i++) {
            int x = a.get(i);
            all *= 3;
            if (x % 2 == 0) {
                bad *= 2;
            }
        }
        int ans = all - bad;
        System.out.println(ans);
    }
}
