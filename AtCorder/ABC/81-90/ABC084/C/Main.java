import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> c = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        List<Integer> f = new ArrayList<>();
        for(int i = 0;i < n-1;i++){
            c.add(sc.nextInt());
            s.add(sc.nextInt());
            f.add(sc.nextInt());
        }
        for(int i = 0;i < n;i++){
            int t = 0;
            for(int j = i;j < n-1;j++){
                if(t <= s.get(j)){
                    t = s.get(j);
                }
                else if(t % f.get(j) == 0){
                }
                else{
                    t = t + f.get(j) - t % f.get(j);
                }
                t += c.get(j);
            }
            System.out.println(t);
        }
    }
}
