import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        int Alice = 0;
        int Bob = 0;
        Collections.sort(a,Collections.reverseOrder());
        int index = 0;
        for(Integer it : a){
            if(index % 2 == 0){
                Alice += it;
            }
            else{
                Bob += it;
            }
            index++;
        }
        System.out.println(Math.abs(Alice - Bob));
    }
}
