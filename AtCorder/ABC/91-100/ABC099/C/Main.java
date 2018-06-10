import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nine = new ArrayList<>();
        List<Integer> six = new ArrayList<>();
        nine.add(9);
        for(int i = 1;i <= 6;i++){
            nine.add(nine.get(i-1)*9);
        }
        six.add(6);
        for(int i = 1;i <= 6;i++){
            six.add(six.get(i-1)*6);
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(nine);
        list.addAll(six);
        Collections.sort(list);
        //System.out.println(list);
        int[] dp = new int[n+1];
        for(int i = 1;i <= n;i++){
            for(Integer v : list){
                if(v > i){
                    continue;
                }
                System.out.println(v);
                dp[i] = Math.min(dp[i],dp[i-v]+1);
            }
        }
        System.out.println(Arrays.toString(dp));
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
