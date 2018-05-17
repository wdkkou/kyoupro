import java.util.Scanner;
public class Main069{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String words = sc.next();
        System.out.print(words.charAt(0));
        System.out.print(words.length()-2);
        System.out.println(words.charAt(words.length()-1));
    }
}
