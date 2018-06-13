import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        for(int i = 0;i < n;i++){
            x.add(sc.nextInt());
        }
        int min = 0;
        for(int i = 0;i < n;i++){
            if(x.get(i) <= k - x.get(i)){
                min += x.get(i)*2;
            }
            else{
                min += (k - x.get(i))*2;
            }
        }
        System.out.println(min);
    }
}
