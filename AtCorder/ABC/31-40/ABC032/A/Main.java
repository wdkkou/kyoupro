import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int ans = Math.min(x-1,n-x);
        System.out.println(ans);
    }
}
