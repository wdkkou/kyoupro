import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        int cnt = 0;
        for (int i = 0; i < t - 1; i++) {
            cnt += a.get(i);
        }
        int ans = a.get(t - 1) - cnt - 1;
        if (ans <= 0) {
            System.out.println(0);
            return;
        }
        System.out.println(ans);
    }
}
