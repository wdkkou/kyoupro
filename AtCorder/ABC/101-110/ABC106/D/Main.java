import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int que = sc.nextInt();

        int[][] sum = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            sum[l][r]++;
        }

        List<Integer> p = new ArrayList<>();
        List<Integer> q = new ArrayList<>();
        for (int i = 0; i < que; i++) {
            p.add(sc.nextInt());
            q.add(sc.nextInt());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] += sum[i - 1][j];
                sum[i][j] += sum[i][j - 1];
                sum[i][j] -= sum[i - 1][j - 1];
            }
        }

        for (int i = 0; i < que; i++) {
            int ans = sumRange(sum, p.get(i), q.get(i));
            System.out.println(ans);
        }
    }
    public static int sumRange(int[][] sum, int l, int r) {
        int ans = sum[r][r] - sum[r][l - 1] - sum[l - 1][r] + sum[l - 1][l - 1];
        return ans;
    }
}
