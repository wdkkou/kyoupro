import java.util.Scanner;
import java.util.ArrayList;
public class Main050{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> t = new ArrayList<Integer>();
        for(int i = 0; i < N;i++){
            t.add(sc.nextInt());
        }

        int M = sc.nextInt();
        int sum = 0;
        for(int i = 0;i < N;i++){
            sum += t.get(i);
        }
        for(int i = 0;i < M;i++){
            int p = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(sum + x - t.get(p-1));
        }
    }
}
