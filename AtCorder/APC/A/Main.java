import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if (x % y == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(x);
    }
}
