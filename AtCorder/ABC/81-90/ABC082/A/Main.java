import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a,b);
        int mid = Math.abs(a-b);
        int ans = 0;
        if(mid % 2 == 0){
            ans = mid/2 + min;
        }
        else{
            ans = (mid/2 + 1) + min;
        }
        System.out.println(ans);
    }
}
