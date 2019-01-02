import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if (Math.abs(x - y) <= 1) {
            System.out.println("Brown");
            return;
        }
        System.out.println("Alice");
    }
}
