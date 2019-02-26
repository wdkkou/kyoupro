import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Float> x = new ArrayList<>();
        List<String> u = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextFloat());
            u.add(sc.next());
        }
        float ans = 0;
        for (int i = 0; i < n; i++) {
            if (u.get(i).equals("JPY")) {
                ans += x.get(i);
            } else if (u.get(i).equals("BTC")) {
                ans += (float) 380000.0 * x.get(i).floatValue();
            }
        }
        System.out.printf("%.5f%n", ans);
    }
}
