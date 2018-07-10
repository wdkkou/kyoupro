import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.contains("a") && s.contains("b") && s.contains("c")){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
