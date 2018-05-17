import java.util.Arrays;
import java.util.Scanner;
public class Main093{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0;i < 3;i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;
        Arrays.sort(a);
        if((a[1] - a[0]) % 2 == 0){
            count += a[2] - a[1];
            count += (a[2] - a[0] - count) / 2;
        }
        else{
            count += a[2] - a[1];
            count += (a[2] - a[0] - count) / 2;
            count += 2;
        }
        System.out.println(count);
    }
}
