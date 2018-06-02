import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        while(true){
            if(x <= a && x % b == 0){
                System.out.println(x);
                return;
            }
            x--;
        }
    }
}
