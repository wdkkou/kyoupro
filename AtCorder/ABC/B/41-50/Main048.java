import java.util.Scanner;
public class Main048{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        System.out.println(f(b,x) - f(a-1,x));
    }
    public static long f(long n,long x){
        if(n == -1){
            return 0;
        }
        return n/x +1;
    }
}
