import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < 6; i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
