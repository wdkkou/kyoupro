import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = sc.nextInt();
        int w = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        if (n == 1) {
            System.out.println(Math.abs(w - a.get(0)));
            return;
        }
        int ans1 = Math.abs(a.get(n - 2) - a.get(n - 1));
        int ans2 = Math.abs(w - a.get(n - 1));
        System.out.println(Math.max(ans1, ans2));
    }
}
