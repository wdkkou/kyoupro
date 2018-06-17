import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        boolean ok = true;
        for(int i = 0;i < 3;i++){
            if(c1.charAt(i) != c2.charAt(2-i)){
                ok = false;
            }
        }
        if(ok){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
