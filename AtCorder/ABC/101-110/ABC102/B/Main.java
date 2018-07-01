import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }

        int max = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                int x = a.get(i) - a.get(j);
                max = Math.max(max,x);
            }
        }
        System.out.println(max);
    }
}
