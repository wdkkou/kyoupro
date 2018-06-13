import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if(num.charAt(0) == '9' | num.charAt(1) == '9'){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
