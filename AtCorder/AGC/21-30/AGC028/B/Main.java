import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Long> a = new ArrayList<>();
        List<Long> b = new ArrayList<>();
        List<Long> c = new ArrayList<>();
        List<Long> d = new ArrayList<>();
        for(int i = 0;i < t;i++){
            a.add(sc.nextLong());
            b.add(sc.nextLong());
            c.add(sc.nextLong());
            d.add(sc.nextLong());
        }

        for(int i = 0;i < t;i++){
            if(solve(a.get(i),b.get(i),c.get(i),d.get(i))){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    public static boolean solve(long a,long b,long c,long d){
        long x = a;
        while(true){
            a -= b;
            if(a < 0){
                break;
            }
            if(a <= c){
                a += d;
            }
            if(a == x){
                return true;
            }
        }
        return false;
    }
}
