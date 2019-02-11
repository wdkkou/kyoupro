import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            max = Math.max(max, a);
            map.put(a, b);
        }
        int ans = map.get(max);
        ans += max;
        System.out.println(ans);
    }
}
