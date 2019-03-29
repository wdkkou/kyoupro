import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String str = s.substring(i, j);
                int cnt = 0;
                for (int k = 0; k < str.length(); k++) {
                    char ch = str.charAt(k);
                    if (!(ch == 'A' || ch == 'C' || ch == 'G' || ch == 'T')) {
                        cnt = 0;
                        break;
                    }
                    cnt++;
                }
                ans = Math.max(ans, cnt);
            }
        }
        System.out.println(ans);
    }
}
