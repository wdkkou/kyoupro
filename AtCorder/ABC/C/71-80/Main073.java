import java.util.Arrays;
import java.util.Scanner;
public class Main073{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] num = new int[N];
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int j = 0;
        num[0] = 1;
        for(int i = 1;i < N;i++){
            if(a[i-1] == a[i]){
                num[j]++;
                continue;
            }
            j++;
            num[j]++;
        }
        int count = 0;
        for(int i = 0;i < N;i++){
            if(num[i] % 2 == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
