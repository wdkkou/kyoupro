import java.util.*;

public class PartialSum {
    public static void main(String[] args) {
        // example 1
        int[] num1 = { 7, 5, 3 };
        if (!solve1(num1, num1.length, 10)) {
            System.out.println("NO");
        } else {
            System.out.println("Yes");
        }

        // example 2
        int[] num2 = { 9, 7 };
        if (!solve1(num2, num2.length, 6)) {
            System.out.println("NO");
        } else {
            System.out.println("Yes");
        }
        // example 3
        int[] num3 = { 7, 5, 3, 1, 8 };
        System.out.println(solve2(num3, num3.length, 12));
        // example 4
        int[] num4 = { 4, 1, 1, 1 };
        System.out.println(solve2(num4, num4.length, 5));
    }

    public static boolean solve1(int[] num, int n, int k) {
        boolean[][] dp = new boolean[n + 1][k + 1];
        dp[0][0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i + 1][j] |= dp[i][j];
                if (j - num[i] >= 0 && dp[i][j - num[i]]) {
                    dp[i + 1][j] = dp[i][j - num[i]];
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[n][k];
    }

    static long MOD = 1000000007;

    public static long solve2(int[] num, int n, int k) {
        long[][] dp = new long[n + 1][k + 1];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i + 1][j] = dp[i][j];
                if (j - num[i] >= 0) {
                    dp[i + 1][j] += dp[i][j - num[i]];
                }
                dp[i + 1][j] %= MOD;
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[n][k];
    }

}
