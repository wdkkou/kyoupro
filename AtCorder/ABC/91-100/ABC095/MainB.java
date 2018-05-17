import java.util.Scanner;
import java.util.Arrays;
public class MainB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] m = new int[N];
        for(int i = 0;i < N;i++){
            m[i] = sc.nextInt();
            X -= m[i];
        }
        Arrays.sort(m);
        int count = N;
        while(X >= m[0]){
            X -= m[0];
            count++;
        }
        System.out.println(count);
    }
}
