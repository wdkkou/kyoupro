import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> t = new ArrayList<>();
        for(int i = 0;i < n;i++){
            t.add(sc.nextLong());
        }
        long answer = 1L;
        for(Long it : t){
            answer = lcm(answer,it);
        }
        System.out.println(answer);

    }
    public static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public static long gcd(long a,long b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
