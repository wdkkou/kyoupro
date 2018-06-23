import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        for(long i = 1; i <= 8;i++){
            if(i > k){
                break;
            }
            System.out.println(i);
        }
        long cnt = 8;
        for(long i = 9; i <= Math.pow(10,15);i+=10){
            if(cnt >= k){
                break;
            }
            if(i*sum(i+1) <= (i+1)*sum(i)){
                cnt++;
                System.out.println(i);
            }
        }
    }
    public static long sum(long x){
        long ans = 0;
        while(x != 0){
            ans += x % 10;
            x /= 10;
        }
        return ans;
    }
}
