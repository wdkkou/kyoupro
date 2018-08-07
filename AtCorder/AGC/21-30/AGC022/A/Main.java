import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> str = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            str.add(s.charAt(i));
        }
        if(s.length() != 26){
            Iterator it = str.iterator();
            char ch = 'a';
            for (int i = 0; i < 26; i++) {
                char x = (char) it.next();
                if (x != ch) {
                    System.out.println(s + ch);
                    break;
                }
                ch++;
            }
            return;
        }
        int max = -1;
        char maxc = ' ';
        for(int i = 25;i >= 0;i--){
            char tmp = str.charAt(i);
            for(int j = i-1;j >= 0;j--){
                if(str.charAt(j) < tmp){
                    if(max < j){
                        max = j;
                        maxc = tmp;
                    }
                }
            }
        }
    }
}
