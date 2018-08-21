import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(0);
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int t = sc.nextInt();
            for (int j = l; j <= r; j++) {
                a.set(j, t);
            }
        }
        for (Integer it : a) {
            System.out.println(it);
        }
    }
}
