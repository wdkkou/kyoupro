import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ab = b-a;
        int cb = c-b;
        if(ab == cb){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
