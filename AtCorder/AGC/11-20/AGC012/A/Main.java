import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3 * n; i++) {
            a.add(sc.nextInt());
        }

        Collections.sort(a, Collections.reverseOrder());
        long ans = 0;
        for (int i = 1; i < 2 * n; i += 2) {
            ans += a.get(i);
        }
        System.out.println(ans);
    }
}
