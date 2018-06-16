import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        long x = 1;
        for(int i = 1;i <= d;i++){
            x *= 100;
        }
        if(n < 100){
            System.out.println(x*n);
        }
        else{
            System.out.println(x*n+x);
        }
    }
}
