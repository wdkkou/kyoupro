import java.util.Scanner;
public class Main065{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        for(int i = 1;i <= N;i++){
            a[i] = sc.nextInt();
        }
        int count = 1;
        int x = a[1];
        for(int i = 1;i <= N;i++){
            if(x == 2){
                System.out.println(count);
                return;
            }
            count++;
            x = a[x];
        }
        System.out.println(-1);
    }
}
