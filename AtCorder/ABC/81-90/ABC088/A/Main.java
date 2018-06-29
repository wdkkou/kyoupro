import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int x = n % 500;
        if(x - a <= 0){
            System.out.println("Yes");
            return;
        }
            System.out.println("No");
    }
}
