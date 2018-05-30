import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        
        String first = s1.substring(0,1).toUpperCase();
        String middle = s2.substring(0,1).toUpperCase();
        String last = s3.substring(0,1).toUpperCase();
        System.out.println(first + middle + last);
    }
}
