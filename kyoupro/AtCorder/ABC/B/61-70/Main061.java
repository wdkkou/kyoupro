import java.util.Scanner;
public class Main061{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        int[] num = new int[N+1];
        for(int i = 0;i < M;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i = 0;i < M;i++){
            num[a[i]]++;
            num[b[i]]++;
        }
        for(int i = 1;i <= N;i++){
            System.out.println(num[i]);
        }
    }
}
