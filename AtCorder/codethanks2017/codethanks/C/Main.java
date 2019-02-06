import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        Queue<Pair> q = new PriorityQueue<Pair>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            q.add(new Pair(a[i], i));
        }

        long ans = 0;
        for (int i = 0; i < k; i++) {
            Pair p = q.poll();
            ans += p.a;
            q.add(new Pair(p.a + b[(int) p.b], p.b));
        }
        System.out.println(ans);
    }
}
class Pair implements Comparable<Pair> {
    long a, b;
    Pair(long x, long y) {
        a = x;
        b = y;
    }
    public int compareTo(Pair o) {
        return Long.compare(a, o.a);
    }
}
