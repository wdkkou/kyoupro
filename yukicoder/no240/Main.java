import java.util.*;
import java.io.*;

public class Main {
    static long[] dx = { -2, -2, -1, -1, 1, 1, 2, 2 };
    static long[] dy = { -1, 1, -2, 2, -2, 2, -1, 1 };
    static long ex;
    static long ey;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        ex = sc.nextLong();
        ey = sc.nextLong();
        if (dfs(0, 0, 0)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

    public static boolean dfs(long x, long y, int cnt) {
        // System.out.printf("x = %d , y = %d ,cnt = %d %n", x, y, cnt);
        if (x == ex && y == ey) {
            return true;
        }
        if (cnt >= 3) {
            return false;
        }
        for (int i = 0; i < 8; i++) {
            long nx = x + dx[i];
            long ny = y + dy[i];
            if (dfs(nx, ny, cnt + 1)) {
                return true;
            }
        }
        return false;
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
