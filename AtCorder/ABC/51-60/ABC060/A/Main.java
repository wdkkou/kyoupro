import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int a_length = a.length();
        int b_length = b.length();
        if(a.charAt(a_length-1) == b.charAt(0) && b.charAt(b_length-1) == c.charAt(0)){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
