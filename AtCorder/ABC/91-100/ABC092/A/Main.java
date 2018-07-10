import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min = 0;
        if(a <= b){
            min += a;
        }
        else{
            min += b;
        }
        if(c <= d){
            min += c;
        }
        else{
            min += d;
        }
        System.out.println(min);
    }
}
