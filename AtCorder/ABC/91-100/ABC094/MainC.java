import java.util.Scanner;
import java.util.Arrays;
public class MainC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int [n];
        for(int i = 0;i < n;i++){
            x[i] = sc.nextInt();
        }
        int[] a = x.clone();
        Arrays.sort(x);
        for(int i = 0;i < n;i++){
            if(a[i] < x[n/2]){
                System.out.println(x[n/2]);
            }
            else{
                System.out.println(x[n/2-1]);
            }
        }
    }
}
