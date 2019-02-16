import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Long> a = new ArrayList<>();
        List<Long> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
            b.add(sc.nextLong());
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a.get(i) * b.get(i);
        }
        Collections.sort(b, Comparator.reverseOrder());
        ans += b.get(0) * x;
        System.out.println(ans);
    }
}
