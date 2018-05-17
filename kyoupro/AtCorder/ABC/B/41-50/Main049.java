import java.util.Scanner;
import java.util.Arrays;
public class Main049{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] s = new String[H];
        for(int i = 0;i <  H;i++){
            s[i] = sc.next();
        }
        System.out.println();
        for(int i = 0;i < H;i++){
            System.out.println(s[i]);
            System.out.println(s[i]);
        }
    }
}
