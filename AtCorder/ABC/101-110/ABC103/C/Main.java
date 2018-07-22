import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Long> a = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            a.add(sc.nextLong());
        }
        long m = 1L;
        //        for(Long it : a){
        //            m = lcm(m,it);
        //        }
        //        //System.out.println("lcm = " +m);
        long answer = 0;
        for(int i = 0;i < n;i++){
            answer += a.get(i)-1;
        }
        System.out.println(answer);
    }
    public static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    public static long gcd(long a,long b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
