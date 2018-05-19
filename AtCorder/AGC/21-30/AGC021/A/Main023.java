import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main023{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N+1];
        for(int i = 1;i <= N;i++){
            a[i] = sc.nextLong();
        }
        long[] s = new long[N+1];
        s[0] = 0;
        for(int i = 1;i <= N;i++){
            s[i] = s[i-1] + a[i];
        }
        HashMap<Long,Long> map = new HashMap<Long,Long>();
        for(int i = 0;i <= N;i++){
            if(map.containsKey(s[i])){
                map.put(s[i],map.get(s[i])+1L);
            }
            else{
                map.put(s[i],1L);
            }
        }
        long count = 0;
        for(Long key : map.keySet()){
            long value = map.get(key);
            if(value >= 1){
                count += value * (value-1) / 2;
            }
        }
        System.out.println(count);
    }
}
