import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        if(x-t <= 0){
            System.out.println(0);
            return;
        }
        System.out.println(x-t);
    }
}
