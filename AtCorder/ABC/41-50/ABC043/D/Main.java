import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            System.out.println("1 2");
            return;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            String str = s.substring(i, i + 3);
            if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2)
                || str.charAt(0) == str.charAt(2)) {
                System.out.printf("%d %d%n", i + 1, i + 3);
                return;
            }
        }
        System.out.println("-1 -1");
    }
}
