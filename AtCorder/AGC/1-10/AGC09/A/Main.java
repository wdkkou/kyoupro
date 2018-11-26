import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        List<Long> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
            b.add(sc.nextLong());
        }

        long cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            long aIndex = a.get(i) + cnt;
            if(aIndex % b.get(i) == 0){
                continue;
            }
            cnt += b.get(i) - aIndex % b.get(i);
        }
        System.out.println(cnt);
    }
}
