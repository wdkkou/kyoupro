import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        List<Long> dp = new ArrayList<>();
        dp.add(0L);
        dp.add(Math.abs(a.get(1) - a.get(0)));
        for (int i = 2; i < n; i++) {
            long diff1 = Math.abs(a.get(i - 2) - a.get(i));
            long diff2 = Math.abs(a.get(i - 1) - a.get(i));
            long min = Math.min(dp.get(i - 2) + diff1, dp.get(i - 1) + diff2);
            dp.add(min);
        }
        System.out.println(dp.get(n-1));
    }
}
