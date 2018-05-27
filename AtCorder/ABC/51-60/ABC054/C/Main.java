import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
<<<<<<< HEAD
        int[][] g = new int[n][n];
        for(int i = 0;i < m;i++){
            int k = sc.nextInt();
            int l = sc.nextInt();
            g[k][l] = 1;
        }
        int cnt = dfs(i,n,0);
        System.out.println(cnt);
    }
    public int dfs(int i,int n,int cnt){
        if(i == n){
            return cnt;
        }
        for(int j = 0;j < m;j++){
            cnt += dfs(i,n,cnt);
=======
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0;i < m;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
>>>>>>> 28ad9476edfff96bd4d2f55fe1835283a0bbc75a
        }
    }
}
