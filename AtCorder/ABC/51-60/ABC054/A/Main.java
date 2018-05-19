import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A == 1 && B > 1){
            System.out.println("Alice");
            return;
        }
        if(B == 1 && A > 1){
            System.out.println("Bob");
            return;
        }
        if(A < B){
            System.out.println("Bob");
            return;
        }
        if(A > B){
            System.out.println("Alice");
            return;
        }
        if(A == B){
            System.out.println("Draw");
            return;
        }
    }
}
