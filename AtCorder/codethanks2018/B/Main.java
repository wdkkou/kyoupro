import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int total = x + y;
        int k = total / 4;
        if (total % 4 != 0) {
            System.out.println("No");
            return;
        }
        if (!((x - k) % 2 == 0 && x - k >= 0)) {
            System.out.println("No");
            return;
        }
        if (!((y - k) % 2 == 0 && y - k >= 0)) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
