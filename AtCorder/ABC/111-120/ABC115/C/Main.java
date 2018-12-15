import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            h.add(sc.nextInt());
        }
        Collections.sort(h);


        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            ans = Math.min(ans, h.get(i + k - 1) - h.get(i));
        }
        System.out.println(ans);
    }
}
