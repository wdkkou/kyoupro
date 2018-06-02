import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0;i < n;i++){
            x[i] = sc.nextInt();
        }
        int[][][][] dp = new int[n+1][i][j][k];
        for(int x = 1; x <= n;x++){
            if(i < j < k){
                if(x[j]-x[i]<=d && x[k]-x[j]<=d && x[k]-x[i]>d){
                    dp[x][i][j][k] = dp[x-1][i][j][k] + 1;
                    continue;
                }
            }
            dp[x][i][j][k] = dp[x-1][i][j][k];
        }
    }
}
