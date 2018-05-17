import java.util.Scanner;
public class Main080{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int f = N;
        int ans = 0;
        while(N != 0){
            ans += N % 10;
            N /= 10;
        }
        if(f % ans == 0){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
