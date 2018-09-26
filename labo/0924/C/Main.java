import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a, Collections.reverseOrder());
        int sum = 0;
        int cnt = 0;
        for (Integer i : a) {
            if (i == x) {
                continue;
            }
            sum += i;
            cnt++;
            if(sum >= k){
                break;
            }
        }
        System.out.println(cnt);
    }
}
