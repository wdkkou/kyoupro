import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> t = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        t.add(0);
        x.add(0);
        y.add(0);
        for(int i = 0;i < n;i++){
            t.add(sc.nextInt());
            x.add(sc.nextInt());
            y.add(sc.nextInt());
        }
        boolean can = true;
        for(int i = 1;i <= n;i++){
            int dt = t.get(i) - t.get(i-1);
            int dist = Math.abs(x.get(i)-x.get(i-1)) + Math.abs(y.get(i)-y.get(i-1));
            if(!(dist <= dt && ((dist % 2) == (dt % 2)))){
                can = false;
            }
        }
        if(can){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
