import java.util.*;
public class UnionFind {
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
    public static void main(String[] args) {
        int n = 3;
        UnionFind u = new UnionFind(3);
        u.unite(1, 2);
        for (int i = 0; i < n; i++) {
            System.out.println(u.root(i));
        }
    }
}
