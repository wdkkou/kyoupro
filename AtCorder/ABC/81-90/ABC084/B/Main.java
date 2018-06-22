import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        boolean ok = true;
        for(int i = 0;i < s.length();i++){
            if(i == a && s.charAt(a) != '-'){
                ok = false;
            }
            if(i != a && s.charAt(i) == '-'){
                ok = false;
            }
        }

        if(ok){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
