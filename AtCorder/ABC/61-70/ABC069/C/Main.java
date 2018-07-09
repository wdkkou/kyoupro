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
        long cnt4 = 0;
        long cnt2 = 0;
        for(Integer it : a){
            if(it % 4 == 0){
                cnt4++;
            }
            else if(it % 2 == 0){
                cnt2++;
            }
        }
        if(cnt4 + (cnt2 / 2) >= n / 2){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
