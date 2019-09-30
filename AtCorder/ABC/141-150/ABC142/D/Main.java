import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        long a = sc.nextLong();
        long b = sc.nextLong();
        Set<Long> alist = new HashSet<>();
        Set<Long> blist = new HashSet<>();
        for (long i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                alist.add(i);
                alist.add(a / i);
            }
        }
        for (long i = 1; i * i <= b; i++) {
            if (b % i == 0) {
                blist.add(i);
                blist.add(b / i);
            }
        }
        List<Long> list = new ArrayList<>();
        for (long i : alist) {
            if (blist.contains(i)) {
                list.add(i);
            }
        }
        Collections.sort(list);
        // System.out.println(list);
        long ans = 1;
        List<Long> div = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            long y = list.get(i);
            boolean ok = true;
            for (long k : div) {
                if (y % k == 0) {
                    ok = false;
                }
            }
            if (!ok) {
                continue;
            }
            ans++;
            div.add(y);
        }
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
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
