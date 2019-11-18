import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 1000000007;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        long x = sc.nextLong();
        long y = sc.nextLong();
        if ((x + y) % 3 != 0) {
            System.out.println(0);
            return;
        }
        long n = (2 * y - x) / 3;
        long m = (x - n) / 2;
        if (n < 0 || m < 0) {
            System.out.println(0);
            return;
        }
        long ans = calcComb(n + m, n);
        System.out.println(ans);
    }

    public static long calcComb(long n, long k) {
        if (k > n - k) {
            return calcComb(n, n - k);
        }
        long ansMul = 1;
        long ansDiv = 1;
        for (long i = 0; i < k; i++) {
            ansMul *= n - i;
            ansDiv *= i + 1;
            ansMul %= MOD;
            ansDiv %= MOD;
        }
        long ans = ansMul * pow(ansDiv, MOD - 2);
        ans %= MOD;
        return ans;
    }

    public static long pow(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        ans %= MOD;
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
