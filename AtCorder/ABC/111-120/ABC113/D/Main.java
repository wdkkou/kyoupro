import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 1000000007;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int K = sc.nextInt();
        long[][] dp = new long[h + 1][w];
        dp[0][0] = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = 0; k < (1 << (w - 1)); k++) {
                    boolean ok = true;
                    for (int l = 0; l < w - 2; l++) {
                        if (((k >> l) & 1) == 1 && ((k >> (l + 1)) & 1) == 1) {
                            ok = false;
                        }
                    }
                    if (!ok) {
                        continue;
                    }
                    // System.out.println("k = " + k);
                    // System.out.println("i = " + i);
                    // System.out.println("j = " + j);
                    // System.out.printf("dp[%d][%d] = %d%n", i, j, dp[i][j]);
                    if (j >= 1 && ((k >> (j - 1)) & 1) == 1) {
                        dp[i + 1][j - 1] += dp[i][j];
                        dp[i + 1][j - 1] %= MOD;
                        // System.out.printf("dp[%d][%d] = %d%n", i + 1, j - 1, dp[i + 1][j - 1]);
                    } else if (j <= w - 2 && ((k >> j) & 1) == 1) {
                        dp[i + 1][j + 1] += dp[i][j];
                        dp[i + 1][j + 1] %= MOD;
                        // System.out.printf("dp[%d][%d] = %d%n", i + 1, j + 1, dp[i + 1][j + 1]);
                    } else {
                        dp[i + 1][j] += dp[i][j];
                        dp[i + 1][j] %= MOD;
                        // System.out.printf("dp[%d][%d] = %d%n", i + 1, j, dp[i + 1][j]);
                    }
                    // System.out.println(Arrays.deepToString(dp));
                }
            }
        }
        System.out.println(dp[h][K - 1]);
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
