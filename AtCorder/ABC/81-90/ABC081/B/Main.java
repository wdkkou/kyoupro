import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }

        int ans = 100;
        for(Integer it : a){
            int cnt = solve(it);
            ans = Math.min(ans,cnt);
        }
        System.out.println(ans);
    }
    public static int solve(int x){
        int cnt = 0;
        while(x % 2 == 0){
            x /= 2;
            cnt++;
        }
        return cnt;
    }
}
