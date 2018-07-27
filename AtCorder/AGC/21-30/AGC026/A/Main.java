import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        int max = 0;
        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            a.add(x);
            max = Math.max(max,x);
        }
        int cnt = 0;
        int color = max+1;
        for(int i = 0;i < n-1;i++){
            if(a.get(i) != a.get(i+1)){
                continue;
            }
            a.set(i+1,color);
            color++;
            cnt++;
        }
        System.out.println(cnt);
    }
}
