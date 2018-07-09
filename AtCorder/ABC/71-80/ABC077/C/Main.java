import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        for(int i = 0;i < n;i++){
            b.add(sc.nextInt());
        }
        for(int i = 0;i < n;i++){
            c.add(sc.nextInt());
        }
    }
}
