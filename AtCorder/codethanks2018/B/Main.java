import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int total = x + y;
        int sub = x + y;
        if (total % 4 == 0 && (sub % 2 == 0 || sub == 0)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
