import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = { 0, 1, 0, -1, -1, -1, 1, 1 };
    static int[] dy = { 1, 0, -1, 0, 1, -1, 1, -1 };
    static int INF = 1000000000;
    static boolean[][] used;
    static int h = 0;
    static int w = 0;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if (h == 0 && w == 0) {
                return;
            }
            used = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int x = sc.nextInt();
                    if (x == 1) {
                        used[i][j] = true;
                    }
                }
            }
            // System.out.println(Arrays.deepToString(used));

            long ans = 0;
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if (!used[y][x]) {
                        continue;
                    }
                    Point p = new Point(x, y);
                    bfs(p);
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

    public static void bfs(Point s) {
        Queue<Point> que = new LinkedList<>();
        que.offer(s);
        used[s.y][s.x] = false;
        while (!que.isEmpty()) {
            Point p = que.poll();
            for (int i = 0; i < 8; i++) {
                // System.out.printf("p = %s", p);
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];
                // System.out.printf("nx = %d, ny = %d%n", nx, ny);
                if (nx < 0 || ny < 0 || nx >= w || ny >= h) {
                    continue;
                }
                if (!used[ny][nx]) {
                    continue;
                }
                used[ny][nx] = false;
                // System.out.printf("nx = %d ,ny = %d %n", nx, ny);
                que.offer(new Point(nx, ny));
            }
        }
        return;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(x = %d,y = %d)", this.x, this.y);
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
