import java.util.Scanner;
public class Main046{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int [N];
        int[] a = new int [N];
        for(int i = 0;i < N;i++){
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        long A = t[0];
        long B = a[0];
        long n = 1;
        for(int i = 1;i < N;i++){
            if(t[i] < A || a[i] < B){
                //    nの値を更新 nはA,B
                if(A % t[i] == 0 && B % a[i] == 0){
                    n = Math.max(A/t[i],B/a[i]);
                }
                if(A % t[i] != 0 && B % a[i] != 0){
                    n = Math.max(A/t[i]+1,B/a[i]+1);
                }
                if(A % t[i] != 0 && B % a[i] == 0){
                    n = Math.max(A/t[i]+1,B/a[i]);
                }
                if(A % t[i] == 0 && B % a[i] != 0){
                    n = Math.max(A/t[i],B/a[i]+1);
                }
            }
            A = n*t[i];
            B = n*a[i];
            //System.out.println("n = " + n);
            //System.out.printf("A = %d B = %d\n",A,B);
        }
        System.out.println(A+B);
    }
}
