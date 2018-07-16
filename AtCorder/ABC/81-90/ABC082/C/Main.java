import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> a = new HashMap<>();
        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            if(a.containsKey(x)){
                a.put(x,a.get(x)+1);
                continue;
            }
            a.put(x,1);
        }
        int cnt = 0;
        for(Integer key : a.keySet()){
            int num = key;
            if(key > a.get(key)){
                cnt += a.get(key);
                continue;
            }
            cnt += a.get(key) - num;
        }
        System.out.println(cnt);
    }
}
