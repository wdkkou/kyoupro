import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        double p = sc.nextDouble();
        int[] cnt = new int[n + 1];
        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j <= n; j += i) {
        // cnt[j]++;
        // }
        // }
        for (int i = 2; i <= n; i++) {
            int tmp = i;
            int div = 1;
            for (int j = 2; j * j <= tmp; j++) {
                if (tmp % j != 0) {
                    continue;
                }
                int res = 0;
                while (tmp % j == 0) {
                    res++;
                    tmp /= j;
                }
                div *= res + 1;
            }
            if (tmp != 1) {
                div *= 2;
            }
            cnt[i] += div;
        }
        // System.out.println(Arrays.toString(cnt));
        double ans = 0;
        for (int i = 2; i <= n; i++) {
            if (cnt[i] == 0) {
                ans++;
                continue;
            }
            ans += Math.pow(1 - p, cnt[i] - 2);
        }
        System.out.printf("%.6f%n", ans);
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
