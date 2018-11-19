public class UnionFind {
    int[] par;
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
            par[rx] = ry;
        }
    }
    public boolean same(int x, int y) {
        return root(x) == root(y);
    }
}
