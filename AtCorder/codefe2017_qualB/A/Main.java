import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String ans = s.substring(0, n - 8);
        System.out.println(ans);
    }
}
