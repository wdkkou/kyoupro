import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for (int x : p) {
            if (x <= a) {
                cnt1++;
            }
            if (x > a && x <= b) {
                cnt2++;
            }
            if (x > b) {
                cnt3++;
            }
        }
        System.out.println(Math.min(cnt1, Math.min(cnt2, cnt3)));
    }
}

