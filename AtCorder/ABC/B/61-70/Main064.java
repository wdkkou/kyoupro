import java.util.Arrays;
import java.util.Scanner;
public class Main064{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[N-1] - a[0]);
    }
}
