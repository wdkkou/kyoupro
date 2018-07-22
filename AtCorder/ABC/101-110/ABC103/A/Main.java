import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i < 3;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        int ans = Math.abs(a.get(0) - a.get(1)) + Math.abs(a.get(2) - a.get(1));
        System.out.println(ans);
    }
}
