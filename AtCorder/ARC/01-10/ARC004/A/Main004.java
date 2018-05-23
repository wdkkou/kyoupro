import java.util.Scanner;
import java.util.Arrays;
public class Main004{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] x = new double [N];
        double[] y = new double [N];
        for(int i = 0;i < N;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        float d ;
        float max = 1 ;
        for(int i = 0;i < N;i++){
            for(int j = i+1;j < N;j++){
                d = (float) Math.hypot(x[i]-x[j],y[i]-y[j]);
                if(d > max){
                    max = d;
                }
            }
        }
        System.out.println(max);
    }
}
