import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main081{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        int[] num = new int[N+1];
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < N;i++){
            num[a[i]]++;
        }
        Arrays.sort(num);
        int x; 
        int count = 0;
        x = N;
        while(x > 0){
            if(num[x] > 0){
                count++;
            }
            x--;
        }
        int kakikae = 0;
        if(count > K){
            for(int i = 0;i < N - K + 1;i++){
                kakikae += num[i]; 
            }
        }
        System.out.println(kakikae);
    }
}

