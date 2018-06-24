import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> d = new TreeSet<>();
        for(int i = 0;i < n;i++){
            d.add(sc.nextInt());
        }
        int min = -1;
        int ans = 0;
        for(Integer it : d){
            if(it <= min){
                break;
            }
            else{
                min = it;
                ans++;
            }
        }

        System.out.println(ans);
    }
}
