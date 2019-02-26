import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextLong());
        }

        Collections.sort(x);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += x.get(i) * (i - (n - 1 - i));
        }
        System.out.println(ans);
    }
}
