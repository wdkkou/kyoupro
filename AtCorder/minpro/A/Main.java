import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k == 1) {
            System.out.println("YES");
            return;
        }
        if (n % 2 == 0) {
            if (n / 2 >= k) {
                System.out.println("YES");
                return;
            }
        } else {
            if ((n / 2 + 1) >= k) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
