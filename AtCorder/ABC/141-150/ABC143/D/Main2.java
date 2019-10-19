import java.util.*;
import java.io.*;

public class Main2 {
    static int ok;
    static int ng;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        // System.out.println(Arrays.toString(l));
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int a = l[i];
            for (int j = i + 1; j < n; j++) {
                int b = l[j];
                // System.out.printf("a = %d,b = %d%n", a, b);
                // System.out.printf("a + b = %d%n", a + b);
                // System.out.println("bin = " + binSearch(l, a + b));
                ans += binSearch(l, a + b) - j;
            }
        }
        System.out.println(ans);
    }

    public static long binSearch(int[] b, int x) {
        ok = 0;
        ng = b.length;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (solve(mid, b, x)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    public static boolean solve(int mid, int[] b, int x) {
        if (b[mid] >= x) {
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
