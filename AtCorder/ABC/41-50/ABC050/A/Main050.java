import java.util.Scanner;
public class Main050{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        int ans = 0;
        if(op.equals("+")){
            ans = a + b;
        }
        if(op.equals("-")){
            ans = a - b;
        }
        System.out.println(ans);
    }
}
