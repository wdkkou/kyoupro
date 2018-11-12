import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        int gCnt = 0;
        int n = s.length();
        if (n % 2 != 0) {
            gCnt = n / 2 + 1;
        } else {
            gCnt = n / 2;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'g') {
                cnt++;
            }
        }
        System.out.println(cnt - gCnt);
    }
}
