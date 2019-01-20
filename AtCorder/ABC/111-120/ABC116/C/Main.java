import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int ans = h[0];
        for (int i = 1; i < n; i++) {
            if (h[i - 1] < h[i]) {
                ans += h[i] - h[i - 1];
            }
        }
        System.out.println(ans);
    }
}
