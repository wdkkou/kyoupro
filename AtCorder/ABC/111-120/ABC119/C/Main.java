import java.util.Scanner;
import java.util.*;
public class Main {
    static int ans = Integer.MAX_VALUE;
    static int n;
    static int[] a;
    static int[] l;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int[] k = new int[n];
        dfs(0, k);
        System.out.println(ans);
    }
    public static void dfs(int depth, int[] k) {
        // System.out.println("depth = " + depth);
        // System.out.println("k = " + Arrays.toString(k));
        // System.out.println("n = " + n);
        if (depth == n) {
            ans = Math.min(ans, calc(k));
            return;
        }
        for (int i = 0; i < 4; i++) {
            k[depth] = i;
            dfs(depth + 1, k);
        }
    }
    public static int calc(int[] k) {
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < n; i++) {
            if (k[i] == 0) {
                sum1 += l[i];
                cnt1++;
            }
            if (k[i] == 1) {
                sum2 += l[i];
                cnt2++;
            }
            if (k[i] == 2) {
                sum3 += l[i];
                cnt3++;
            }
        }
        if (cnt1 == 0 || cnt2 == 0 || cnt3 == 0) {
            return Integer.MAX_VALUE;
        }
        int ans = Math.abs(a[0] - sum1) + Math.abs(a[1] - sum2) + Math.abs(a[2] - sum3)
            + 10 * (cnt1 + cnt2 + cnt3 - 3);
        return ans;
    }
}
