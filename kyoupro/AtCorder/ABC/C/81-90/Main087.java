import java.util.Scanner;
import java.util.Arrays;
public class Main087{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] a = new int[2][N];
        for(int i = 0;i < 2;i++){
            for(int j = 0; j < N;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[] sum = new int[N];
        for(int i = 0;i < N;i++){
            int l = 0;
            while(l <= i){
                sum[i] += a[0][l];
                l++;
            }
            for(int j = i; j < N;j++){
                sum[i] += a[1][j];
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[N-1]);
    }
}
