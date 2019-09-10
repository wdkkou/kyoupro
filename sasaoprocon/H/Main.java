import java.util.*;
import java.io.*;

public class Main {
    static long ok;
    static long ng;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[m + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }
        b[m] = 0;
        Arrays.sort(b);
        List<Long> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long res = binSearch(a[i], b);
            ans.add(res);
        }
        for (long i : ans) {
            if (i < 1) {
                System.out.println(0);
                continue;
            }
            System.out.println(i);
        }
    }

    public static long binSearch(long x, long[] b) {
        ok = 0;
        ng = b.length;
        while (Math.abs(ok - ng) > 1) {
            long mid = (ok + ng) / 2;
            if (solve(mid, b, x)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return b[(int) ok];
    }

    public static boolean solve(long mid, long[] b, long x) {
        if (b[(int) mid] > x) {
            return false;
        }
        return true;
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
