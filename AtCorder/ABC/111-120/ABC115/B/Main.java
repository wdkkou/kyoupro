import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }
        Collections.sort(p);
        int ans = p.get(n - 1) / 2;

        for (int i = 0; i < n - 1; i++) {
            ans += p.get(i);
        }
        System.out.println(ans);
    }
}
