import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int w = sc.nextInt();
        int i = 0;
        String ans = "";
        while(i < s.length()){
            ans += s.charAt(i);
            i += w;
        }
        System.out.println(ans);
    }
}
