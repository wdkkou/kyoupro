import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        a.add(0);
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        a.add(0);
        long sum = 0;
        for(int i = 0;i <= n;i++){
            sum += Math.abs(a.get(i+1)-a.get(i));
        }

        for(int i = 1;i <= n;i++){
            long x = sum + Math.abs(a.get(i-1)-a.get(i+1));
            long si = x - (Math.abs(a.get(i-1)-a.get(i))+Math.abs(a.get(i+1)-a.get(i)));
                System.out.println(si);
        }
    }
}
