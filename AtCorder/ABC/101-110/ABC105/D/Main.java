import java.util.Scanner;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextLong());
        }
        List<Long> sum = new ArrayList<>();
        long x = 0L;
        for(Long it : a){
            x += it;
            sum.add(it);
        }
        for(int i = 1; i < n;i++){
            int x = sum.get(i) - sum.get(i-1);
            sum.add();
        }

    }
}
