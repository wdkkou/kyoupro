import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Long> x = new ArrayList<>();
        List<Long> y = new ArrayList<>();
        List<Long> z = new ArrayList<>();
        for(int i = 0;i < n;i++){
            x.add(sc.nextLong());
            y.add(sc.nextLong());
            z.add(sc.nextLong());
        }
        List<Long> w = new ArrayList<>();;
        w.add(-1L);
        w.add(1L);
        long max = 0;
        for(Long it1 : w){
            for(Long it2 : w){
                for(Long it3 : w){
                    List<Long> sum = new ArrayList<>();;
                    for(int i = 0;i < n;i++){
                        long total = it1*x.get(i) + it2*y.get(i) + it3*z.get(i);
                        sum.add(total);
                    }
                    //System.out.printf("w1 = %d,w2 = %d,w3 = %d\n",it1,it2,it3);
                    //System.out.println("sum = " + sum);
                    //System.out.println("sum = " + sum);
                    max = Math.max(max,solve(sum,m));
                }
            }
        }
        System.out.println(max);
    }
    public static long solve(List<Long> sum,int k){
        Collections.sort(sum,Collections.reverseOrder());
        long max = 0;
        for(int i = 0;i < k;i++){
           max += sum.get(i);
        }
        //System.out.println(max);
        return max;
    }
}
