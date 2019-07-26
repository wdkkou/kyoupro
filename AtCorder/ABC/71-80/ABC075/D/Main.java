import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        List<Long> xlist = new ArrayList<>();
        List<Long> ylist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            xlist.add(x[i]);
            ylist.add(y[i]);
        }
        Collections.sort(xlist);
        Collections.sort(ylist);
        long ans = (xlist.get(n - 1) - xlist.get(0)) * (ylist.get(n - 1) - ylist.get(0));
        for (int x_min = 0; x_min < n; x_min++) {
            for (int x_max = x_min + 1; x_max < n; x_max++) {
                for (int y_min = 0; y_min < n; y_min++) {
                    for (int y_max = y_min + 1; y_max < n; y_max++) {
                        int cnt = 0;
                        long lx = xlist.get(x_min);
                        long rx = xlist.get(x_max);
                        long by = ylist.get(y_min);
                        long uy = ylist.get(y_max);
                        // System.out.println("lx = " + lx);
                        // System.out.println("rx = " + rx);
                        // System.out.println("by = " + by);
                        // System.out.println("uy = " + uy);
                        for (int i = 0; i < n; i++) {
                            // System.out.printf("x[%d] = %d%n", i, x[i]);
                            // System.out.printf("y[%d] = %d%n", i, y[i]);
                            if (lx <= x[i] && x[i] <= rx && by <= y[i] && y[i] <= uy) {
                                cnt++;
                            }
                        }
                        // System.out.println("cnt = " + cnt);
                        if (cnt >= k) {
                            long res = Math.abs(rx - lx) * Math.abs(uy - by);
                            ans = Math.min(ans, res);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
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
