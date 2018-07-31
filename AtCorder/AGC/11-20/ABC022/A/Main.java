import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> str = new HashSet<>();
        for(int i = 0;i < s.length();i++){
            str.add(s.charAt(i));
        }
        if(s.length == 26){

        }
        char ch = 'a';
        for(int i = 0;i < 26;i++){
            //System.out.println("ch : " + ch);
            if(!(str.contains(ch))){
                System.out.println(s + ch);
                return;
            }
            ch++;
        }
        System.out.println(-1);
    }
}
