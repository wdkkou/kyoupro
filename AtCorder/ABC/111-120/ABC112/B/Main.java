import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        List<Integer> c = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            c.add(sc.nextInt());
            t.add(sc.nextInt());
        }
        int min = 10000000;
        int index = 0;
        for(int i = 0;i < n;i++){
            if(t.get(i) > time){
                continue;
            }
            min = Math.min(min,c.get(i));
        }
        if(min >= 10000000){
            System.out.println("TLE");
            return;
        }
        System.out.println(min);
    }
}
