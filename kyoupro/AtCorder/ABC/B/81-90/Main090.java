import java.util.Scanner;
import java.util.Arrays;
public class Main090{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] ans = new int[5];
        int count = 0;
        for(int i = A;i <= B;i++){
            int j = 0;
            int x = i;
            while(x > 0){
                ans[j++] = x % 10;
                x /= 10;
                //System.out.println("i = " + x);
                //System.out.println("ans[] = " + ans[j]);
            }
            if(ans[0] == ans[4] && ans[1] == ans[3]){
                count++;
            }
        }
        System.out.println(count);
    }
}
