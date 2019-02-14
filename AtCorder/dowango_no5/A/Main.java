import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> a = new ArrayList<>();
        double max = 0;
        for (int i = 0; i < n; i++) {
            double k = sc.nextDouble();
            max += k;
            a.add(k);
        }
        double average = max / n;
        double min = max;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(average - a.get(i)) < min) {
                min = Math.abs(average - a.get(i));
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
