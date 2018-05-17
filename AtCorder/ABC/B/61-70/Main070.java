import java.util.Scanner;
import java.util.Arrays;
public class Main070{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int [2];
        int[] b = new int [2];
        for(int i = 0;i < 2;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < 2;i++){
            b[i] = sc.nextInt();
        }
        int ans = Math.min(a[1],b[1]) - Math.max(a[0],b[0]);
        if(ans <= 0){
            System.out.println(0);
            return;
        }
        System.out.println(ans);
    }
}
