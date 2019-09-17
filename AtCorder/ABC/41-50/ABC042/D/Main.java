import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 1000000007;
    static int size = 200005;
    static long[] factorial = new long[size];
    static long[] inverse = new long[size];

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        factorial[0] = 1;
        for (int i = 0; i < h + w; i++) {
            factorial[i + 1] = factorial[i] * (i + 1) % MOD;
        }
        for (int i = 0; i < h + w; i++) {
            inverse[i] = pow(factorial[i], MOD - 2) % MOD;
        }
        // System.out.println(Arrays.toString(factorial));
        // System.out.println(Arrays.toString(inverse));
        long ans = 0;
        for (int i = b; i < w; i++) {
            long res = combine(i + (h - a - 1), i) * combine(w - 1 - i + (a - 1), a - 1) % MOD;
            ans += res;
            ans %= MOD;
        }
        System.out.println(ans);
    }

    public static long combine(int n, int r) {
        long ans = factorial[n] * inverse[n - r] % MOD;
        ans *= inverse[r];
        ans %= MOD;
        return ans;
    }

    public static long pow(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= x;
                ans %= MOD;
            }
            x *= x;
            x %= MOD;
            n >>= 1;
        }
        return ans;
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
