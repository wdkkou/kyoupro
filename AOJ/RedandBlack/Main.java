import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { -1, 0, 1, 0 };
    static long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w == 0 && h == 0) {
                return;
            }
            List<String> str = new ArrayList<>();
            for (int i = 0; i < h; i++) {
                str.add(sc.next());
            }
            int x = 0, y = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (str.get(i).charAt(j) == '@') {
                        y = i;
                        x = j;
                    }
                }
            }
            long[][] dist = bfs(new Point(x, y), str, h, w);
            // System.out.println(Arrays.deepToString(dist));
            long ans = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (dist[i][j] == INF) {
                        continue;
                    }
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

    public static long[][] bfs(Point s, List<String> str, int h, int w) {
        long[][] dist = new long[h][w];
        for (long[] d : dist) {
            Arrays.fill(d, INF);
        }
        Queue<Point> que = new LinkedList<>();
        dist[s.y][s.x] = 0;
        que.offer(s);
        while (!que.isEmpty()) {
            Point p = que.poll();
            // System.out.println(p);
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= w || ny >= h) {
                    continue;
                }
                if (str.get(ny).charAt(nx) == '.' && dist[p.y][p.x] + 1 < dist[ny][nx]) {
                    dist[ny][nx] = 1;
                    que.offer(new Point(nx, ny));
                }
            }
        }

        return dist;
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
        return String.format("(x = %d, y = %d)", this.x, this.y);
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
