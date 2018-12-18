import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans = 2 * (x / 11);
        long amari = x % 11;
        if (amari > 0 && amari <= 6) {
            ans++;
        } else if (amari > 6) {
            ans += 2;
        }
        System.out.println(ans);
    }
}
