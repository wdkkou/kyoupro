import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                int k = sc.nextInt();
                sum += b.get(j) * k;
            }
            sum += c;
            if (sum > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
