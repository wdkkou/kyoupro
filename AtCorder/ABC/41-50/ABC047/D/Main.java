import java.util.Scanner;
import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        Map<Integer, Integer> ans = new TreeMap<>(Comparator.reverseOrder());
        int min = a.get(0);
        for (int i = 1; i < n; i++) {
            if (a.get(i) <= min) {
                min = a.get(i);
                continue;
            }
            int b = Math.abs(a.get(i) - min);
            if (!ans.containsKey(b)) {
                ans.put(b, 0);
            }
            ans.put(b, ans.get(b) + 1);
        }
        System.out.println(ans.values().toArray()[0]);
    }
}
