import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if(0 <= r && r < 1200){
            System.out.println("ABC");
            return;
        }
        else if(1200 <= r && r < 2800){
            System.out.println("ARC");
            return;
        }
        System.out.println("AGC");
    }
}
