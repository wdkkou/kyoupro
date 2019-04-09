import java.util.*;
public class UnionFind {
    public static void main(String[] args) {
        int n = 3;
        UnionFind u = new UnionFind(3);
        u.unite(1, 2);
        for (int i = 0; i < n; i++) {
            System.out.println(u.root(i));
        }
    }
    static int[] par;
    static int[] rank;
    static int[] size;
    public UnionFind(int n) {
        this.par = new int[n];
        this.rank = new int[n];
        this.size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
            size[i] = 1;
        }
    }

    // find == root
    public int root(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = root(par[x]);
    }

    public int getSize(int x) {
        return size[root(x)];
    }

    public void unite(int x, int y) {
        x = root(x);
        y = root(y);
        if (x == y) {
            return;
        }
        if (rank[x] < rank[y]) {
            par[x] = y;
            size[y] += size[x];
        } else {
            par[y] = x;
            size[x] += size[y];
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
        }
    }

    public boolean same(int x, int y) {
        return root(x) == root(y);
    }

    public String toString() {
        return String.format("par = %s %n", Arrays.toString(par));
    }
}
