import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n * 2;
        if(n % 2 == 0){
            System.out.println(n);
            return;
        }
        System.out.println(ans);
    }
}
