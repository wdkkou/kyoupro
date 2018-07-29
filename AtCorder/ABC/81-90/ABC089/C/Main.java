import java.util.Scanner;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character,Set<String>> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            String str = sc.next();
            char x = str.charAt(0);
            if(!(x == 'M'||x == 'A'||x == 'R'||x == 'C'||x == 'H')){
                continue;
            }
            if(!map.containsKey(x)){
                map.put(x,new HashSet<String>());
            }
            map.get(x).add(str);
        }
        if(map.size() < 3){
            System.out.println(0);
            return;
        }
        List<Set<String>> list = new ArrayList<>(map.values());
        long ans = 0;
        for(int i = 0;i < list.size();i++){
            for(int j = i+1;j < list.size();j++){
                for(int k = j+1;k < list.size();k++){
                    long x = (long) list.get(i).size() * (long) list.get(j).size() * (long) list.get(k).size() ;
                    ans += x;
                }
            }
        }
        System.out.println(ans);
    }
}
