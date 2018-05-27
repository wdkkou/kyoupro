import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean honest = false;
        if(a.equals("H")){
            if(b.equals("H")){
                honest = true;
            }
            if(b.equals("D")){
                honest = false;
            }
        }
        if(a.equals("D")){
            if(b.equals("H")){
                honest = false;
            }
            if(b.equals("D")){
                honest = true;
            }
        }
        if(honest){
            System.out.println("H");
            return;
        }
            System.out.println("D");
    }
}
