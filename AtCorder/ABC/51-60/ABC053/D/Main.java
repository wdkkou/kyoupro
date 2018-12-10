import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> a = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if (!a.containsKey(key)) {
                a.put(key, 0);
                cnt++;
                //    System.out.println(cnt);
            }
            a.put(key, a.get(key) + 1);
        }
        if ((n - cnt) % 2 == 0) {
            System.out.println(cnt);
            return;
        }
        System.out.println(cnt - 1);
    }
}
