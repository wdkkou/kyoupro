import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = (b-a)*(n-2)+1;
        if(a > b || ans < 0){
            System.out.println(0);
            return;
        }
        if(n > 1){
            System.out.println(ans);
        }
        else{
            if(a != b){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
