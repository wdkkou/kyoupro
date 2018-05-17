import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int max = Math.max(A,Math.max(B,C));
        int sum = 0;
        sum += A + B + C - max;
        for(int i = 0;i < K;i++){
            max *= 2;
        }
        sum += max;
        System.out.println(sum);
    }
}
