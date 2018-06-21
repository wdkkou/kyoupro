import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int L = a + b; 
        int R = c + d; 

        if(L > R){
            System.out.println("Left");
        }
        else if(L == R){
            System.out.println("Balanced");
        }
        else if(L < R){
            System.out.println("Right");
        }
    }
}
