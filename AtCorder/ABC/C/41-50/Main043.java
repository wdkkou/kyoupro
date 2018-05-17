import java.util.Scanner;
import java.util.ArrayList;
public class Main043{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0;i < N;i++){
            a.add(sc.nextInt());
        }
        long min = 100000000;
        for(int y = -100;y <= 100;y++){
            long sum = 0;
            for(int i = 0;i < N;i++){
                sum += (a.get(i) - y)*(a.get(i) - y);
            }
            min = Math.min(min,sum);
        }
        System.out.println(min);
    }
}
