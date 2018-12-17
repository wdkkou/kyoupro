import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long cnt = 0;
        for (long i = x; i <= y; i *= 2) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
