import java.util.Scanner;
import java.util.Arrays;
public class Main044{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int[] x = new int[N];
        for(int i = 0;i < N;i++){
            x[i] = sc.nextInt();
        }
        long[][][] dp = new long[N + 1][N + 1][N * 50 + 1];
        for(int j = 0; j <= N; j++) {
            dp[j][0][0] = 1;
        }
        for(int j = 1; j <= N;j++){
            for(int k = 1; k <= N;k++){
                for(int s = 0; s <= N * 50; s++){
                    long cnt = 0;
                    cnt += dp[j - 1][k][s];
                    if(s - x[j - 1] >= 0) {
                        cnt += dp[j - 1][k - 1][s - x[j - 1]];
                    }
                    dp[j][k][s] = cnt;
                }
            }
        }
        System.out.println(dp[3][1][7]);
        long ans = 0;
        for(int k = 1; k <= N; k++){
            for(int s = 0; s <= N * 50; s++){
                if(s == k * A) {
                    ans += dp[N][k][s];
                }
            }
        }
        System.out.println(ans);
    }
}
