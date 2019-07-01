import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 1000000000;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = n - k;
        long[] ans = new long[k];
        ans[0] = n - k + 1;
        for (int i = 1; i < k; i++) {
            long cnt1 = Math.max((k - i - 1) * (i + 1), 1) % MOD;
            long cnt2 = Math.max((r - i) * i, 1) % MOD;
            long cnt3 = Math.max((k - i - 1) * (i + 1), 1) % MOD;
            long cnt4 = Math.max((r - i - 1) * (i + 1), 1) % MOD;
            long cnt5 = Math.max((k - i - 1) * (i + 1), 1) % MOD;
            long cnt6 = Math.max((r - i - 2) * i, 0) % MOD;
            ans[i] += cnt1 * cnt2 % MOD;
            ans[i] += cnt3 * cnt4 % MOD * 2 % MOD;
            ans[i] += cnt5 * cnt6 % MOD;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
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
