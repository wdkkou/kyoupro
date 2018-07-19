import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] f = new int[100][100];
        int[][] p = new int[100][100];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < 10;j++){
                f[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= 10;j++){
                p[i][j] = sc.nextInt();
            }
        }

        int res = Integer.MIN_VALUE;
        for(int bit = 1; bit < (1<<10);bit++){
            int cc = 0;
            for(int i = 0;i < n;i++){
                int c = 0;
                for(int j = 0;j < 10;j++){
                    if((bit >> j&1) == 1&& f[i][j] == 1){
                        c++;
                    }
                }
                cc += p[i][c];
                //System.out.println("cc = " + cc);
            }
            res = Math.max(res,cc);
            //System.out.printf("b = %d ,res = %d\n",bit,res);
        }
        System.out.println(res);
    }
}
