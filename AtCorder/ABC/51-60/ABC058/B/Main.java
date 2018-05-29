import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        String e = sc.next();
        String pas = "";
        for(int i = 0;i < o.length();i++){
            pas += o.charAt(i);
            if(e.length() - (i+1) < 0){
                break;
            }
            pas += e.charAt(i);
        }
        System.out.println(pas);
    }
}
