import java.util.Scanner;
public class Main046{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] t = new long[N];
        long[] a = new long[N];
        for(int i = 0;i < N;i++){
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        long A = 1;
        long B = 1;
        for(int i = 0;i < N;i++){
            long n = Math.max((A+t[i]-1)/t[i],(B+a[i]-1)/a[i]);
            A = n*t[i];
            B = n*a[i];
        }
        System.out.println(A+B);
    }
}
