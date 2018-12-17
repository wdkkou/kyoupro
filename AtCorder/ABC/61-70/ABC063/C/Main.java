import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.add(x);
            sum += x;
        }
        Collections.sort(s);
        for (int i = 0; i < n; i++) {
            if (sum % 10 != 0) {
                break;
            }
            if (s.get(i) % 10 == 0) {
                continue;
            }
            sum -= s.get(i);
        }
        if (sum % 10 == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(sum);
    }
}
