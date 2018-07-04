import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String s = "" + a.charAt(0) + b.charAt(1) + c.charAt(2);
        System.out.println(s);
    }
}
