import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
            y.add(sc.nextInt());
            h.add(sc.nextInt());
        }
        for (int X = 0; X <= 100; X++) {
            for (int Y = 0; Y <= 100; Y++) {
                boolean ok = true;
                int H = 0;
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if (h.get(i) < 1) {
                        continue;
                    }
                    H = h.get(i) + Math.abs(x.get(i) - X) + Math.abs(y.get(i) - Y);
                    cnt++;
                }
                for (int i = 0; i < n; i++) {
                    if (h.get(i) < 1) {
                        continue;
                    }
                    if (H != h.get(i) + Math.abs(x.get(i) - X) + Math.abs(y.get(i) - Y)) {
                        ok = false;
                        break;
                    }
                    if (cnt == 1 && H != 1) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    System.out.printf("%d %d %d\n", X, Y, H);
                    return;
                }
            }
        }
    }
}
