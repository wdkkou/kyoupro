import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 1000000007;
    static int A = 1, G = 2, C = 3, T = 4;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        long[][][][] dp = new long[N + 1][5][5][5];
        dp[0][0][0][0] = 1;
        for (int n = 0; n < N; n++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        for (int l = 1; l < 5; l++) {
                            if (i == A && j == G && l == C) {
                                continue;
                            }
                            if (i == A && k == G && l == C) {
                                continue;
                            }
                            if (j == A && k == G && l == C) {
                                continue;
                            }
                            if (j == G && k == A && l == C) {
                                continue;
                            }
                            if (j == A && k == C && l == G) {
                                continue;
                            }
                            dp[n + 1][j][k][l] += dp[n][i][j][k];
                            dp[n + 1][j][k][l] %= MOD;
                        }
                    }
                }
            }
        }

        long res = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    res += dp[N][i][j][k];
                    res %= MOD;
                }
            }
        }
        System.out.println(res);
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
