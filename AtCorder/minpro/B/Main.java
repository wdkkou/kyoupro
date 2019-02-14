import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            a[x]++;
            a[y]++;
        }
        for (int i = 0; i < 4; i++) {
            if (a[i] > 2) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
