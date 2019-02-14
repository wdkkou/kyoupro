import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(sc.next());
        }

        int ans = 100;
        for (int i = 0; i < n; i++) {
            String s = p.get(i);
            int cnt = 0;
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) != '0') {
                    break;
                }
                cnt++;
            }
            ans = Math.min(ans, cnt);
        }
        System.out.println(ans);
    }
}
