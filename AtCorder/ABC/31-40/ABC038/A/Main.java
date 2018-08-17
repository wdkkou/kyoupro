import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.charAt(s.length() - 1) == 'T') {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
