import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max + min - n <= 0) {
            System.out.println(min + " " + 0);
            return;
        }
        System.out.println(min + " " + (max + min - n));
    }
}
