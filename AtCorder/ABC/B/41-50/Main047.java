import java.util.Scanner;
import java.util.Arrays;
public class Main047{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] a = new int[100];
        int[] x = new int[100];
        int[] y = new int[100];
        int[][] xy = new int[W][H];
        for(int i = 0;i < N;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < N;i++){
            if(a[i] == 1){
                for(int j = 0;j < x[i];j++){
                    for(int k = 0;k < H;k++){
                        xy[j][k] = 1;
                    }
                }
            }
            if(a[i] == 2){
                for(int j = x[i];j < W;j++){
                    for(int k = 0;k < H;k++){
                        xy[j][k] = 1;
                    }
                }
            }
            if(a[i] == 3){
                for(int j = 0;j < W;j++){
                    for(int k = 0;k < y[i];k++){
                        xy[j][k] = 1;
                    }
                }
            }
            if(a[i] == 4){
                for(int j = 0;j < W;j++){
                    for(int k = y[i];k < H;k++){
                        xy[j][k] = 1;
                    }
                }
            }
        }
        //for(int i = 0;i < W;i++){
        //    for(int j = 0;j < H;j++){
        //        System.out.print(xy[i][j]+" ");
        //    }
        //}
        //System.out.println();
        int S = 0;
        for(int i = 0;i < W;i++){
            for(int j = 0;j < H;j++){
                if(xy[i][j] == 0){
                    S ++;
                }
            }
        }
        System.out.println(S);
    }
}
