import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 100;
        for(int i = 1;i+i <= n;i++){
            int a = i;
            int b = n-i;
            int asum = solve(a);
            int bsum = solve(b);
            int total = asum + bsum;
            min = Math.min(min,total);
        }
        System.out.println(min);
    }
    public static int solve(int x){
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}

