import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        for(int i = 0;i < n;i++){
            b.add(sc.nextInt());
        }
        for(int i = 0;i < n;i++){
            c.add(sc.nextInt());
        }
        Collections.sort(a);
        Collections.sort(c);
        long count = 0;
        for(int i= 0;i < n;i++){
            long k = lower_bound(n,a,b.get(i));
            long j = n - upper_bound(n,c,b.get(i));
            count += k*j;
        }
        System.out.println(count);
    }
    public static long lower_bound(int n,List x,int k){
        int lb = -1;
        int ub = n;

        while(ub - lb > 1){
            int mid = (ub + lb) / 2;
            int m = (int) x.get(mid);
            if(m >= k){
                ub = mid;
            }
            else{
                lb = mid;
            }
        }
        return ub;
    }
    public static long upper_bound(int n,List x,int k){
        int lb = -1;
        int ub = n;

        while(ub - lb > 1){
            int mid = (ub + lb) / 2;
            int m = (int) x.get(mid);
            if(m <= k){
                lb = mid;
            }
            else{
                ub = mid;
            }
        }
        return ub;
    }
}
