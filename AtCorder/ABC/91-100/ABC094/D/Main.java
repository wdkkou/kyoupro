import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        Collections.sort(a);
        long max = a.get(n - 1);
        long middle = max / 2;
        long r = 0;
        long tmp = max;
        for (long i : a) {
            if (i == max) {
                continue;
            }
            if (Math.abs(middle - i) <= tmp) {
                tmp = Math.abs(middle - i);
                r = i;
            }
        }
        System.out.printf("%d %d%n", max, r);
    }
}
