import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int max = 0;
        for(int i = 0;i < s.length();i++){
            Set<Character> first = new HashSet<Character>(); 
            Set<Character> last = new HashSet<Character>(); 
            for(int j = 0;j <= i;j++){
                first.add(s.charAt(j));
            }
            for(int j = i+1;j < s.length();j++){
                last.add(s.charAt(j));
            }
            int cnt = 0;
            for(Character key : first){
                if(last.contains(key)){
                    cnt++;
                }
            }
            max = Math.max(max,cnt);
        }
        System.out.println(max);

    }
}
