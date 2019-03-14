import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = h * w;
        ans -= x * w;
        ans -= (h - x) * y;
        System.out.println(ans);
    }
}
