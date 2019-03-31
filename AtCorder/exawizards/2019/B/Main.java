import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                cnt1++;
            } else if (s.charAt(i) == 'B') {
                cnt2++;
            }
        }
        if (cnt1 > cnt2) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
