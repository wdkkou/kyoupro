import jva.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> t = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            t.add(sc.nextInt());
        }
        Collections.sort(t);
        int cnt = 0;
        int cntBus = 0;
        int min = t.get(0);
        for (int i : t) {
            if (cntBus < c && i <= min + k) {
                cntBus++;
                continue;
            }
            cntBus = 1;
            min = i;
            cnt++;
        }
        cnt++;
        System.out.println(cnt);
    }
}
