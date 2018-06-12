import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int nine = 9;
        for(int i = 0;i < 6;i++){
            list.add(nine);
            nine *= 9;
        }
        int six = 6;
        for(int i = 0;i < 6;i++){
            list.add(six);
            six *= 6;
        }
        Collections.sort(list);
        int[] dp = new int[n+1];
        for(int i = 1;i <= n;i++){
            dp[i] = 1000000000;
        }
        for(int i = 1;i <= n;i++){
            for(Integer v : list){
                if(v > i){
                    continue;
                }
                dp[i] = Math.min(dp[i],dp[i-v]+1);
            }
        }
        System.out.println(dp[n]);

    }
    public static int sub(int n,List<Integer> x){
        int i = x.size();
        if(n <= 0){
            return 0;
        }
        while(n-x.get(i-1) < 0){
            i--;
        }
        return i-1;
    }
}
