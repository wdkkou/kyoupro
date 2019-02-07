import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt() - 1;
        }
        UnionFind u = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            u.unite(x, y);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (u.same(i, p[i])) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
class UnionFind {
    static int[] par;
    public UnionFind(int n) {
        this.par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public int root(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = root(par[x]);
    }
    public void unite(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        if (rx == ry) {
            return;
        }
        par[rx] = ry;
    }
    public boolean same(int x, int y) {
        return root(x) == root(y);
    }
    public String toString() {
        return String.format("par = %s %n", Arrays.toString(par));
    }
}
