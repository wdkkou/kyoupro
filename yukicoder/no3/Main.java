import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int ans = solve(n);
        if (ans == INF) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }

    static int INF = 1000000007;

    public static int solve(int n) {
        boolean[] v = new boolean[n + 1];
        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);
        dist[1] = 1;
        v[0] = true;
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        while (!que.isEmpty()) {
            int num = que.poll();
            // System.out.println("num = " + num);
            if (v[num]) {
                continue;
            }
            v[num] = true;
            int next1 = num + bitCnt(num);
            int next2 = num - bitCnt(num);
            // System.out.println("next1 = " + next1);
            // System.out.println("next2 = " + next2);
            if (next1 > n) {
                dist[next2] = Math.min(dist[next2], dist[num] + 1);
                que.offer(next2);
            } else {
                dist[next1] = Math.min(dist[next1], dist[num] + 1);
                dist[next2] = Math.min(dist[next2], dist[num] + 1);
                que.offer(next1);
                que.offer(next2);
            }
            // System.out.println(Arrays.toString(v));
        }
        // System.out.println(Arrays.toString(dist));
        return dist[n];
    }

    public static int bitCnt(int num) {
        int cnt = 0;
        for (int bit = 0; bit < 20; bit++) {
            if ((num & (1 << bit)) >= 1) {
                cnt++;
            }
        }
        return cnt;
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
