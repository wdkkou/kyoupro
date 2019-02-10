import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> sum = new ArrayList<>();
        long bTotal = 0;
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            bTotal += b;
            sum.add(a + b);
        }
        Collections.sort(sum, Comparator.reverseOrder());
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                continue;
            }
            ans += sum.get(i);
        }
        ans -= bTotal;
        System.out.println(ans);
    }
}
