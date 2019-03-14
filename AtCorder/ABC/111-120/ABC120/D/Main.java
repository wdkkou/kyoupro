import java.util.Scanner;
import java.util.*;
public class Main {
    static int[] f = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    static int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        int[] dp = new int[n + 1];
    
}
