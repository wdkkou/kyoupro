import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        UnionFind u = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            int z = sc.nextInt();
            u.unite(x, y);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = u.root(i);
            set.add(num);
        }
        System.out.println(set.size());
    }
}

class UnionFind {
    /**
     * par それぞれの要素がどの要素に属するかを表す rank 高さを表す size 属する要素の個数を表す
     */
    int[] par;
    int[] rank;
    int[] size;

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
        // System.out.println("x = " + x);
        // System.out.println("y = " + y);
        // System.out.println("rank[x] = " + rank[x]);
        // System.out.println("rank[y] = " + rank[y]);
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
        return String.format("par = %s ", Arrays.toString(par));
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
