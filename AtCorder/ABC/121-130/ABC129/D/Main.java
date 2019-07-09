import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] str = new String[h];
        for (int i = 0; i < h; i++) {
            str[i] = sc.next();
        }
        int[][] l = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                char ch = str[i].charAt(j);
                if (ch == '#') {
                    l[i][j] = 0;
                } else {
                    if (j == 0) {
                        l[i][j] = 1;
                        continue;
                    }
                    l[i][j] = l[i][j - 1] + 1;
                }
            }
        }
        int[][] r = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = w - 1; j >= 0; j--) {
                char ch = str[i].charAt(j);
                if (ch == '#') {
                    r[i][j] = 0;
                } else {
                    if (j == w - 1) {
                        r[i][j] = 1;
                        continue;
                    }
                    r[i][j] = r[i][j + 1] + 1;
                }
            }
        }
        int[][] u = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                char ch = str[i].charAt(j);
                if (ch == '#') {
                    u[i][j] = 0;
                } else {
                    if (i == 0) {
                        u[i][j] = 1;
                        continue;
                    }
                    u[i][j] = u[i - 1][j] + 1;
                }
            }
        }
        int[][] b = new int[h][w];
        for (int i = h - 1; i >= 0; i--) {
            for (int j = 0; j < w; j++) {
                char ch = str[i].charAt(j);
                if (ch == '#') {
                    b[i][j] = 0;
                } else {
                    if (i == h - 1) {
                        b[i][j] = 1;
                        continue;
                    }
                    b[i][j] = b[i + 1][j] + 1;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int res = l[i][j] + r[i][j] + u[i][j] + b[i][j] - 3;
                ans = Math.max(ans, res);
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
