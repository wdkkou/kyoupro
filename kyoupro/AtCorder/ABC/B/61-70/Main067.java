import java.util.Arrays;
import java.util.Scanner;
public class Main067{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] l = new int[N];
        for(int i = 0;i < N;i++){
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int sum = 0;
        for(int i = N-1;i > N-K-1;i--){
            sum += l[i];
        }
        System.out.println(sum);
    }
}
