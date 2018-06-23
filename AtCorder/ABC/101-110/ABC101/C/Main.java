import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        int cnt = 0;
        for(Integer it : a){
            if(it == 1){
                continue;
            }
            it = 1;
            cnt++;
        }

        int ans = 0;
        if(cnt % (k-1) == 0){
            ans = cnt / (k-1);
        }
        else{
            ans = cnt / (k-1) + 1;
        }
        System.out.println(ans);
    }
}
