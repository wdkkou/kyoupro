import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> t = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            t.add(sc.nextInt());
            x.add(sc.nextInt());
            s.add(sc.nextInt());
        }
        int sum = 0;
        int end = 0;
        boolean man = false;
        boolean can = false;
        for (int i = 0; i < n; i++) {
            if (t.get(i) % (l * 2) == x.get(i)) {
               can = true;
            }
            if (t.get(i) % (l * 2) == (l * 2 - x.get(i))) {
               can = true;
            }
            if(can){
                sum += s.get(i);
            }
            if (sum >= k) {
                end = t.get(i);
                man = true;
                break;
            }
            can = false;
        }
        if (!man) {
            System.out.println(-1);
            return;
        }
        System.out.println(end);
    }
}
