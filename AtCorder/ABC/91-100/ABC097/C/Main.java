import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int K = sc.nextInt();
        Set<String> set = new TreeSet<String>();
        for(int i = 0;i < s.length();i++){
            for(int j = 1;j <= K;j++){
                if(i+j > s.length()){
                    break;
                }
                set.add(s.substring(i,i+j));
            }
        }
        //System.out.println(Arrays.toString(set.toArray()));
        int it = 0;
        for(String str : set){
            if(it == K-1){
                System.out.println(str);
            }
            it++;
        }
    }
}
