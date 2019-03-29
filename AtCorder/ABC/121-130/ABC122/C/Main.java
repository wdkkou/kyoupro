import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            l.add(sc.nextInt());
            r.add(sc.nextInt());
        }
        int[] sum = new int[n];
        sum[0] = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                sum[i] = sum[i - 1] + 1;
                continue;
            }
            sum[i] = sum[i - 1];
        }
        for (int i = 0; i < q; i++) {
            int left = l.get(i) - 1;
            int right = r.get(i) - 1;
            int ans = sum[right] - sum[left];
            System.out.println(ans);
        }
    }
}
