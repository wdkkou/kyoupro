import java.util.Scanner;
import java.util.Arrays;
public class Main088{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                c[i][j] = sc.nextInt();
            }
        }
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i = 0;i <= 100;i++){
            a[0] = i;
            for(int j = 0;j < 2;j++){
                b[j] = c[0][j] - a[0];
            }
            a[1] = c[1][0] - b[0];
            a[2] = c[2][0] - b[0];
            if(infomation(a,b,c)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
    public static boolean infomation(int[] a,int[] b,int[][] c){
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                if(a[i] + b[j] != c[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
