import java.util.*;
import java.io.*;
public class Main {
    static long INF = 100000000000L;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int maxw = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        int maxv = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            maxv = Math.max(maxv, v[i]);
        }
        long[][] dp = new long[n + 1][maxv * n + 1];
        for (int i = 0; i <= n; i++) {
            for (int sumv = 0; sumv <= maxv * n; sumv++) {
                dp[i][sumv] = INF;
            }
        }

        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int sumv = 0; sumv <= maxv * n; sumv++) {
                if (sumv - v[i - 1] >= 0) {
                    dp[i][sumv] = Math.min(dp[i][sumv], dp[i - 1][sumv - v[i - 1]] + w[i - 1]);
                }
                dp[i][sumv] = Math.min(dp[i][sumv], dp[i - 1][sumv]);
            }
        }
        long ans = 0;
        for (int sumv = 0; sumv <= maxv * n; sumv++) {
            if (dp[n][sumv] <= maxw) {
                ans = sumv;
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
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
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
