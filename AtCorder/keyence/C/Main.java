import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        long aTotal = 0;
        for (int i = 0; i < n; i++) {
            long x = sc.nextInt();
            a.add(x);
            aTotal += x;
        }
        List<Long> b = new ArrayList<>();
        long bTotal = 0;
        for (int i = 0; i < n; i++) {
            long x = sc.nextInt();
            b.add(x);
            bTotal += x;
        }

        if (aTotal < bTotal) {
            System.out.println(-1);
            return;
        }
        List<Long> sub = new ArrayList<>();
        long cnt = 0;
        long minusTotal = 0;
        for (int i = 0; i < n; i++) {
            long s = a.get(i) - b.get(i);
            if (s < 0) {
                cnt++;
                minusTotal += s;
            }
            sub.add(s);
        }
        if (cnt == 0) {
            System.out.println(0);
            return;
        }
        Collections.sort(sub,Comparator.reverseOrder());

        boolean ok = false;
        for (long i : sub) {
            if (i < 0) {
                continue;
            }
            minusTotal += i;
            cnt++;
            if (minusTotal >= 0) {
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println(-1);
            return;
        }
        System.out.println(cnt);
    }
}
