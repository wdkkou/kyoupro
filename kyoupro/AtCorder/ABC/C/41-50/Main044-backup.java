import java.util.Scanner;
import java.util.Arrays;
public class Main044{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int[] x = new int[N];
        for(int i = 0;i < N;i++){
            x[i] = sc.nextInt() - A;
        }
        int sum = 0;
        long count = 0;
        int[][][] dp = new int[N + 1][N + 1][N * 50 + 1];
        for(int j = 0; j <= N; j++) {
            dp[j][0][0] = 1;
        }
        for(int j = 1; j <= N; j++){
            for(int k = 1; k <= N; k++){
                for(int s = 0; s <= N * 50; s++){
                    int cnt = 0;

                    cnt += dp[j - 1][k][s];
                    if(s - x[j - 1] >= 0) {
                        cnt += dp[j - 1][k - 1][s - x[j - 1]]
                    }

                    dp[j][k][s] = opt;
                }
            }
        }
        int ans = 0;
        for(int k = 1; k <= N; k++){
            for(int s = 0; s <= N * 50; s++){
                // if(s / k == A) {
                if(s == k * A) {
                    ans += dp[N][k][s];
                }
            }
        }
    }

    int[][][] memo = ...
    for(int j = 0; j <= N; j++) {
        dp[j][0][0] = 1;
    }

    int solve(int n, int x[], int j, int k, int s) {
        if(memo[j][k][s] >= 0){
            return memo[j][k][s];
        }

        int ans = 0
        ans += solve(n, x, j - 1, k, s);
        if(s - x[j - 1] >= 0) {
            ans += solve(n, x, j - 1, k - 1, s - x[j - 1]);
        }

        memo[j][k][s] = ans;
        return ans;
    }
}
