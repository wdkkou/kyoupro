import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        UnionFind load = new UnionFind(n);
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            load.unite(x, y);
        }

        UnionFind rail = new UnionFind(n);
        for (int i = 0; i < l; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            rail.unite(x, y);
        }

        Map<Pair, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Pair p = new Pair(load.root(i), rail.root(i));
            if (!map.containsKey(p)) {
                map.put(p, 0);
            }
            map.put(p, map.get(p) + 1);
        }

        for (int i = 0; i < n; i++) {
            Pair p = new Pair(load.root(i), rail.root(i));
            System.out.print(map.get(p));
            if (i == n - 1) {
                break;
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
class UnionFind {
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
            return;
        }
        par[rx] = ry;
    }
    public boolean isSame(int x, int y) {
        return root(x) == root(y);
    }
}
class Pair {
    int x;
    int y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair p) {
        return this.x - p.x;
    }
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair p = (Pair) o;
        return this.x == p.x && this.y == p.y;
    }
    public int hashCode() {
        return Objects.hash(x, y);
    }
    public String toString() {
        return String.format("x: %d y: %d ", this.x, this.y);
    }
}
