import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int ans = 0;
        while(x != 0){
            ans += x % 10;
            x /= 10;
        }
        if(n % ans == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
