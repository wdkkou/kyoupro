import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        int ans = 0;
        for(int i = 0;i < n;i++){
           ans += solve(a,i,d);
        }
        ans += x;
        System.out.println(ans);
    }
    public static int solve(List<Integer> a,int index,int d){
        int ans = 0;
        for(int i = 0;;i++){
            int x = i * a.get(index)+1;
            if(x > d){
                break;
            }
            ans++;
        }
        return ans;
    }
}
