import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        for(int i = 0;i < n;i++){
            char x = s.charAt(n-1);
            s = x + s.substring(0,n-1);
            if(s.equals(t)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
