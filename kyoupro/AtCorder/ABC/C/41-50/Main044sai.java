import java.util.Scanner;
import java.util.Arrays;
public class Main044sai{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int[] x = new int[N];
        for(int i = 0;i < N;i++){
            x[i] = sc.nextInt();
        }
        int[][][] dp = new int[N+1][N+1][50*N+1];
        for(int i = 0;i <= N;i++){
            dp[i][0][0] = 1;
        }
        for(int i = 1;i <= N;i++){
            for(int j = 1;j <= N;j++){
                for(int s = 0;s <= N*50;s++){
                    int cnt = 0;
                    cnt += dp[i-1][j][s];
                    if(s - x[i-1]>= 0){
                        cnt += dp[i-1][j-1][s-x[i-1]];
                    }
                    dp[i][j][s] = cnt;
                }
            }
        }
        System.out.println(dp[4][1][8]);
        long ans = 0;
        for(int j = 1;j <= N;j++){
            for(int s = 0;s <= 50*N;s++){
                if(s == j*A){
                    ans += dp[N][j][s];
                }
            }
        }
        System.out.println(ans);
    }
}
