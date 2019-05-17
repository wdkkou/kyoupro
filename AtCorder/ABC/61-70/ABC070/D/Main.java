import java.util.*;

import java.io.*;

public class Main {
    static long[] len = new long[100010];
    // static Point[] tree = new Point[100010];
    // List<List<Point>> tree = new ArrayList<>();
    static Map<Integer, List<Point>> tree = new HashMap<>();
    static List<Point>[] x;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            if (!tree.containsKey(a)) {
                tree.put(a, new ArrayList<>());
            }
            if (!tree.containsKey(b)) {
                tree.put(b, new ArrayList<>());
            }
            tree.get(a).add(new Point(b, c));
            tree.get(b).add(new Point(a, c));
        }
        int q = sc.nextInt();
        int k = sc.nextInt() - 1;
        // System.out.printf("tree = %s%n", tree);
        dfs(k, -1, 0);
        long[] ans = new long[q];
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            ans[i] = len[x] + len[y];
        }
        for (long a : ans) {
            System.out.println(a);
        }
    }

    public static void dfs(int v, int p, long d) {
        // System.out.printf("v = %d,p = %d ,c = %d %n", v, p, d);
        // System.out.printf("tree[%d] = %s%n", v, tree.get(v));
        len[v] = d;
        // System.out.printf("len[%d] = %d%n", v, d);
        if (!tree.containsKey(v)) {
            return;
        }
        for (Point e : tree.get(v)) {
            if (e.to == p) {
                continue;
            }
            dfs(e.to, v, d + e.cost);
        }
    }

}

class Point {
    int to;
    int cost;

    public Point(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    public String toString() {
        return String.format("to = %s,cost = %s", to, cost);
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
