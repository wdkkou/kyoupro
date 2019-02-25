import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                if (!a.containsKey(x)) {
                    a.put(x, 0);
                }
                a.put(x, a.get(x) + 1);
            }
        }
        int ans = 0;
        for (Integer key : a.keySet()) {
            if (a.get(key) == n) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
