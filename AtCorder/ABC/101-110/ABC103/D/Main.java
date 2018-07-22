import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //        Pair[] pairs = new Pair[m];
        //        for(int i = 0;i < m;i++){
        //            Pair ps = new Pair();
        //            ps.from = sc.nextInt();
        //            ps.end = sc.nextInt();
        //            pairs[i] = ps;
        //        }
        //        Arrays.sort(pairs);
        List<Pair> pairs = new ArrayList<>();
        for(int i = 0;i < m;i++){
            Pair p = new Pair();
            p.from = sc.nextInt();
            p.end= sc.nextInt();
            pairs.add(p);
        }
        Collections.sort(pairs,new PairComparator());
        int cnt = 0;
        int nowclear = 0;
        //for(int i = 0;i < m;i++){
        //    int nowfrom = pairs[i].from;
        //    int nowend = pairs[i].end;
        //    if(nowclear < nowfrom){
        //        cnt++;
        //        nowclear = nowend - 1;
        //    }
        //}
        for(Pair it : pairs){
            int nowfrom = it.from;
            int nowend = it.end;
            if(nowclear < nowfrom){
                cnt++;
                nowclear = nowend - 1;
            }
        }
        System.out.println(cnt);
    }
}
class Pair {
    int from;
    int end;
    //public int compareTo(Object other){
    //    Pair otherpair = (Pair) other;
    //    return end - otherpair.end;
    //}
}
class PairComparator implements Comparator<Pair>{
    public int compare(Pair p1,Pair p2){
        return p1.end - p2.end;
    }
}
