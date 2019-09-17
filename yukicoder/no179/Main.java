import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] s = new String[h];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next();
        }
        boolean color = false;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i].charAt(j) == '#') {
                    color = true;
                    break;
                }
            }
        }
        if (!color) {
            System.out.println("NO");
            return;
        }
        for (int x = -w; x <= w; x++) {
            for (int y = -h; y <= h; y++) {
                if (x == 0 && y == 0) {
                    continue;
                }
                boolean[][] check = new boolean[h][w];
                boolean ok = true;
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (check[i][j]) {
                            continue;
                        }
                        if (s[i].charAt(j) == '.') {
                            continue;
                        }
                        check[i][j] = true;
                        int nx = j + x;
                        int ny = i + y;
                        if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
                            ok = false;
                            break;
                        }
                        if (check[ny][nx]) {
                            ok = false;
                            break;
                        }
                        if (s[ny].charAt(nx) == '.') {
                            ok = false;
                            break;
                        }
                        check[ny][nx] = true;
                    }
                }
                if (ok) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
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
