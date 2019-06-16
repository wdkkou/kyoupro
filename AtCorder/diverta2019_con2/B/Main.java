import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        List<Pair> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(new Pair(x[i], y[i]));
        }

        int ans = 0;
        for (int k = 0; k < n; k++) {
            for (int l = k + 1; l < n; l++) {
                int cnt = 0;
                long dx = x[k] - x[l];
                long dy = y[k] - y[l];
                for (int i = 0; i < n; i++) {
                    Pair next = new Pair(x[i] + dx, y[i] + dy);
                    if (p.contains(next)) {
                        cnt++;
                    }
                }
                ans = Math.max(ans, cnt);
            }
        }
        // Map<Pair, Integer> map = new HashMap<>();
        // for (int i = 1; i < n; i++) {
        // long X = x[i] - x[i - 1];
        // long Y = y[i] - y[i - 1];
        // Pair p = new Pair(X, Y);
        // if (!map.containsKey(p)) {
        // map.put(p, 0);
        // }
        // map.put(p, map.get(p) + 1);
        // }
        // int max = 0;
        // // System.out.println(map);
        // for (Pair key : map.keySet()) {
        // max = Math.max(max, map.get(key));
        // }
        if (n == 2) {
            System.out.println(1);
            return;
        }

        System.out.println(n - ans);
    }
}

class Pair {
    long x;
    long y;

    public Pair(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long compareTo(Pair p) {
        return this.y - p.y;
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
        return String.format("x = %s,y = %s", x, y);
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
