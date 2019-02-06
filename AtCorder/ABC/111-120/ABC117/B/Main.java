import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            max = Math.max(max, num);
            l.add(num);
        }

        int sum = 0;
        for (int x : l) {
            sum += x;
        }
        sum -= max;
        if (max < sum) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
