import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long cnt = 0;
        List<Long> wCnt = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                cnt++;
            }
            wCnt.add(cnt);
        }

        long ans = 0;
        long wmax = wCnt.get(s.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                ans += wmax - wCnt.get(i);
            }
        }
        System.out.println(ans);
    }
}
