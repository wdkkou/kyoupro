import java.util.Scanner;
public class Main {
    static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong() % MOD;
        long b = sc.nextLong() % MOD;
        long c = sc.nextLong() % MOD;
        long ans = a * b % MOD * c % MOD;
        System.out.println(ans);
    }
}
