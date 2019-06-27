import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) {
                return;
            }
            int[] x = new int[n];
            int[] y = new int[m];
            int xTotal = 0;
            int yTotal = 0;
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                xTotal += x[i];
            }
            for (int i = 0; i < m; i++) {
                y[i] = sc.nextInt();
                yTotal += y[i];
            }
            int res = Integer.MAX_VALUE;
            int ansX = 0;
            int ansY = 0;
            boolean ok = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int s = xTotal - x[i] + y[j];
                    int t = yTotal - y[j] + x[i];
                    if (s == t) {
                        if (x[i] + y[j] <= res) {
                            res = x[i] + y[j];
                            ansX = i;
                            ansY = j;
                            ok = true;
                        }
                    }
                }
            }
            if (!ok) {
                System.out.println(-1);
                continue;
            }
            System.out.printf("%d %d%n", x[ansX], y[ansY]);

        }
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
