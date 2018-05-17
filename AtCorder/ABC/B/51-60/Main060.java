import java.util.Scanner;
public class Main060{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        for(int i = A;i <= B*A;i += A){
            if(i % B == C){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
