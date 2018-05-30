import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0;i < n;i++){
            s[i] = sc.next();
        }
        Map<Character,Integer> num = new HashMap<>();
        num = createMap(s[0]);
        for(String line : s){
            Map<Character,Integer> map = createMap(line);
            for(Character key : num.keySet()){
                if(map.get(key) == null){
                    num.put(key,0);
                    continue;
                }
                if(map.get(key) != null){
                    if(num.containsKey(key) && map.get(key) < num.get(key)){
                        num.put(key,map.get(key));
                    }
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(Character key : num.keySet()){
            for(int i = 0;i < num.get(key);i++){
                str.append(key);
            }
        }

        System.out.println(str);
    }
    public static Map<Character,Integer> createMap(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                continue;
            }
            map.put(s.charAt(i),1);
        }
        return map;
    }
}
