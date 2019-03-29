import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.charAt(0) == 'A') {
            System.out.println('T');
            return;
        } else if (str.charAt(0) == 'T') {
            System.out.println('A');
            return;
        } else if (str.charAt(0) == 'C') {
            System.out.println('G');
            return;
        } else if (str.charAt(0) == 'G') {
            System.out.println('C');
            return;
        }
    }
}
