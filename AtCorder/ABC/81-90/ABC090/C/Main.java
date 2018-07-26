import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long n = Math.min(x,y);
        long m = Math.max(x,y);
        if(n == 1 && m == 1){
            System.out.println(1);
            return;
        }
        else if(n == 1 && m != 1){
            System.out.println(m-2);
            return;
        }
        System.out.println((n-2)*(m-2));
    }
}
