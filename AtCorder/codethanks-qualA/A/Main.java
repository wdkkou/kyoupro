import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();

        int ans = a + b + c;
        if (ans <= s && ans >= s - 3) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
