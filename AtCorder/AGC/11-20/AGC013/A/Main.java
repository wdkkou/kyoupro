import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        boolean plus = false;
        boolean minus = false;
        int cnt = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a.get(i + 1) - a.get(i) > 0) {
                if (minus) {
                    cnt++;
                    plus = false;
                    minus = false;
                    continue;
                }
                plus = true;
            } else if (a.get(i + 1) - a.get(i) < 0) {
                if (plus) {
                    cnt++;
                    plus = false;
                    minus = false;
                    continue;
                }
                minus = true;
            }
        }
        System.out.println(cnt);
    }
}
