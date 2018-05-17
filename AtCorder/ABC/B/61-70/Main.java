import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < N;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        Collections.reverse(list);
        int sum = 0;
        for(int i = 0;i < K;i++){
            sum += (list.get(i));
        }
        System.out.println(sum);
    }
}
