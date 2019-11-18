import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            long v = sc.nextLong();
            p[i] = new Pair(i, v);
        }
        Arrays.sort(p, (a, b) -> a.compareTo(b));
        // System.out.println(Arrays.toString(p));
        long[] ans = new long[n];
        long num = 0;
        for (int i = 0; i < n - 1; i++) {
            if (p[i].v != p[i + 1].v) {
                ans[p[i].index] = num;
                num++;
                continue;
            }
            ans[p[i].index] = num;
        }
        ans[p[n - 1].index] = num;
        // System.out.println(Arrays.toString(ans));
        for (long a : ans) {
            System.out.println(a);
        }
    }
}

class Pair {
    long v;
    int index;

    public Pair(int index, long v) {
        this.v = v;
        this.index = index;
    }

    public int compareTo(Pair p) {
        if (this.v == p.v) {
            return this.index - p.index;
        }
        return (int) this.v - (int) p.v;
    }

    public String toString() {
        return String.format("v = %d,index = %d", this.v, this.index);
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
