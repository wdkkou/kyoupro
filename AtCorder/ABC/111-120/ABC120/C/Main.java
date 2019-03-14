import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt1 = 0;
        int cnt0 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt1++;
            } else {
                cnt0++;
            }
        }
        int ans = 2 * Math.min(cnt1, cnt0);
        System.out.println(ans);
    }
}
