import java.util.Scanner;
import java.util.*;
public class Main {
    static int[] c = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a, Comparator.reverseOrder());
        int d = 0;
        int num = 0;
        for (int i : a) {
            if ((n / c[i]) >= d) {
                d = n / c[i];
                num = i;
            }
        }
        int amari = n - d * c[num];
        System.out.printf("%d %d %n", d, num);
        System.out.println("amari = " + amari);
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(num, d);
        int k = 0;
        while (amari != 0) {
            int x = a.get(k);
            if (c[x] - c[num] == 0) {
                k++;
                continue;
            }
            int cnt = amari / (c[x] - c[num]);
            if (cnt > 0) {
                amari %= (c[x] - c[num]);
                map.put(x, cnt);
                map.put(num, d - cnt);
            }
            k++;
        }
        System.out.println(map);
        for (int i = 1; i <= 9; i++) {
        }
    }
}
