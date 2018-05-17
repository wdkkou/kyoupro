import java.util.Scanner;
import java.util.Arrays;
public class Main048{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        long[] a = new long[N];
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }
        long count = 0;
        for(int i = 0;i < N-1;i++){
            long box2 = a[i] + a[i+1];
            long y = box2 - x;
            if(y < 0){
                continue;
            }
            if(a[i+1] - y >= 0){
                a[i+1] -= y;
                count += y;
                continue;
            }
            if(a[i+1] - y < 0 && box2 - y >= 0){
                a[i] -= y - a[i+1];
                a[i+1] = 0;
                count += y;
            }
        }
        System.out.println(count);
    }
}
