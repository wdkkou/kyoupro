import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();
        for(int i = 0;i < n;i++){
            s.add(sc.nextInt());
        }
        Collections.sort(s);
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += s.get(i);
        }
        for(int i = 0;i < n;i++){
            if(sum % 10 != 0){
                break;
            }
            if(s.get(i) % 10 == 0){
                continue;
            }
            sum -= s.get(i);
        }
        if(sum % 10 == 0){
            System.out.println(0);
            return;
        }
        System.out.println(sum);
    }
}
