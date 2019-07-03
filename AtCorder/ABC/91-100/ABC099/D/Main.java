import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int c = sc.nextInt();
        long[][] d = new long[c + 1][c + 1];
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c; j++) {
                d[i][j] = sc.nextLong();
            }
        }
        long[][] color = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                color[i][j] = sc.nextLong();
            }
        }
        long[][] sum = new long[3][c + 1];
        for (int i = 1; i <= c; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sum[(j + k) % 3][i] += d[(int) color[j][k]][i];
                    // System.out.printf("sum[%d][%d] = %d%n", (j + k) % 3, c, sum[(j + k) % 3][c]);
                }
            }
        }
        // System.out.printf("d = %s%n", Arrays.deepToString(d));
        // System.out.printf("color = %s%n", Arrays.deepToString(color));
        // System.out.printf("sum = %s%n", Arrays.deepToString(sum));
        long ans = Long.MAX_VALUE;
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c; j++) {
                for (int k = 1; k <= c; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    long res = sum[0][i] + sum[1][j] + sum[2][k];
                    // System.out.printf("i, j, k= %d %d %d%n", i, j, k);
                    // System.out.printf("res = %d%n", res);
                    ans = Math.min(ans, res);
                }
            }
        }
        System.out.println(ans);
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
