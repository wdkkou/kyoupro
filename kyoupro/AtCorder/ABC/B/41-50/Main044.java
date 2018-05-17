import java.util.Scanner;
import java.util.HashMap;
public class Main044{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        char[] c = w.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0;i < w.length();i++){
            if(map.containsKey(c[i])){
                map.put(c[i],map.get(c[i])+1);
                continue;
            }
            map.put(c[i],1);
        }
        for(Character key : map.keySet()){
            if(map.get(key) % 2 == 1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
