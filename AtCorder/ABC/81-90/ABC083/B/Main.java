import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for(int i = 1;i <= n;i++){
            if(a <= dighitSum(i) && dighitSum(i) <= b){
                ans += i;
            }
        }
        System.out.println(ans);
    }
    public static int dighitSum(int x){
        int ans = 0;
        while(x != 0){
           ans += x % 10;
           x /= 10;
        }
        return ans;
    }
}
