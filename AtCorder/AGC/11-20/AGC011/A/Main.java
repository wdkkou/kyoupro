import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        boolean parity = true;
        for (Integer it : a) {
            if (it % 2 == 1) {
                parity = false;
                break;
            }
        }
        if (parity) {
            if (p == 0) {
                System.out.println((long) Math.pow(2, n));
                return;
            }
            System.out.println(0);
            return;
        }
        System.out.println((long) Math.pow(2,n-1));
    }
}
