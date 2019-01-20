import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        a.add(s);
        int len = 1000000;
        for (int i = 1; i <= len; i++) {
            int f;
            if (a.get(i - 1) % 2 == 0) {
                f = a.get(i - 1) / 2;
            } else {
                f = 3 * a.get(i - 1) + 1;
            }
            a.add(f);
        }
        int ans = 0;
        for (int i = 0; i <= len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (a.get(i) == a.get(j)) {
                    // System.out.printf("i = %d,j = %d %n", i, j);
                    // System.out.printf("a = %d,a = %d %n", a.get(i), a.get(j));
                    ans = j + 1;
                    System.out.println(ans);
                    return;
                }
            }
        }
    }
}
