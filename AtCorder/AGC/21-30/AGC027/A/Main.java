import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            if (x < a.get(i)) {
                break;
            }
            x -= a.get(i);
            cnt++;
        }
        if(x == a.get(n-1)){
            cnt++;
        }
        System.out.println(cnt);
    }
}
