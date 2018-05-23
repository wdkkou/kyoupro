import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        for(int i = 2;i <= n;i++){
            boolean isPrime = true;
            for(int j = 2;j*j <= i;j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                for(int j = 1;j <= n;j++){
                    int x = j;
                    while(x % i == 0){
                        a[i]++;
                        x /= i;
                    }
                }
            }
        }
        long ans = 1;
        for(int i = 2;i <= n;i++){
            ans *= (a[i]+1);
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
