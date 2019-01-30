import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        List<Integer> atack = new ArrayList<>();
        long first = 0;
        boolean ok = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) != 'A' || s.charAt(i) != 'A') {
                ok = true;
                break;
            }
            first++;
        }

        long last = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(s.length() - 1) != 'A' || s.charAt(i) != 'A') {
                break;
            }
            last++;
        }

        long num = 1;
        long total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'A') {
                num = 1;
                continue;
            }
            total += num;
            num++;
        }

        long ans = total * n + last * first * (n - 1);

        if (first == last && !ok) {
            total = 0;
            for (int i = 1; i <= s.length() * n; i++) {
                total += i;
            }
            ans = total;
        }
        System.out.println(ans);
    }
}
