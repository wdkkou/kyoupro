import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean one = false;
        boolean nine = false;
        boolean seven = false;
        boolean four = false;
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            one = true;
        }
        if (a == 9 || b == 9 || c == 9 || d == 9) {
            nine = true;
        }
        if (a == 7 || b == 7 || c == 7 || d == 7) {
            seven = true;
        }
        if (a == 4 || b == 4 || c == 4 || d == 4) {
            four = true;
        }
        if (one && nine && seven && four) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
