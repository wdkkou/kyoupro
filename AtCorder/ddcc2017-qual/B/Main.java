import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = 12;
        int y = 144;
        int z = 1728;
        int ans = z * a + y * b + x * c + d;
        System.out.println(ans);
    }
}
