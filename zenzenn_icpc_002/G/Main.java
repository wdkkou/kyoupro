import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        while (true) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N == 0 && M == 0) {
                return;
            }
            int r = sc.nextInt();
            Map<Integer, List<Pair>> map = new HashMap<>();
            for (int i = 1; i <= M; i++) {
                map.put(i, new ArrayList<>());
            }
            long[] login = new long[N + 1];
            for (int i = 0; i < r; i++) {
                long t = sc.nextLong();
                int n = sc.nextInt();
                int m = sc.nextInt();
                int s = sc.nextInt();
                if (s == 1) {
                    login[n] = t;
                } else {
                    map.get(m).add(new Pair(login[n], t));
                }
            }
            for (int i = 1; i <= M; i++) {
                map.get(i).sort((a, b) -> (int) a.s - (int) b.s);
            }
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                long s = sc.nextInt();
                long e = sc.nextInt();
                int m = sc.nextInt();
                long ans = 0;
                long off = 0;
                long on = s;
                for (Pair p : map.get(m)) {
                    on = Math.max(on, p.s);
                    off = Math.min(e, p.t);
                    ans += Math.max(0, off - on);
                    on = Math.max(on, p.t);
                }
                System.out.println(ans);
            }
        }
    }
}

class Pair {
    long s;
    long t;

    public Pair(long s, long t) {
        this.s = s;
        this.t = t;
    }

    public long compareTo(Pair p) {
        return this.t - p.t;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair p = (Pair) o;
        return this.s == p.s && this.t == p.t;
    }

    public int hashCode() {
        return Objects.hash(s, t);
    }

    public String toString() {
        return String.format("s = %s,t = %s", s, t);
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
