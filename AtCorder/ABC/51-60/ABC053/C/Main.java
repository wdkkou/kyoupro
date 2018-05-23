import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long cnt = 0;
        if(x % 11 != 0){
            long mod = x % 11;
            if(mod <= 6){
            cnt = 2 * (x / 11) + 1;
            }
            else{
            cnt = 2 * (x / 11) + 2;
            }
        }
        else{
            cnt = 2 * (x / 11);
        }
        System.out.println(cnt);
    }
}
