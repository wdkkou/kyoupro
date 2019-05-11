import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        String[] s = new String[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            for (int j = 0; j <= s[i].length() - 2; j++) {
                String x = s[i].substring(j, j + 2);
                if (x.equals("AB")) {
                    ans++;
                }
            }
        }
        long aCnt = 0;
        long bCnt = 0;
        long abCnt = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].charAt(0) == 'B' && s[i].charAt(s[i].length() - 1) == 'A') {
                abCnt++;
            } else if (s[i].charAt(0) == 'B') {
                bCnt++;
            } else if (s[i].charAt(s[i].length() - 1) == 'A') {
                aCnt++;
            }
        }

        // System.out.println("ans = " + ans);
        // System.out.println("a = " + aCnt);
        // System.out.println(bCnt);
        // System.out.println(abCnt);
        // if (Math.abs(aCnt - bCnt) >= abCnt) {
        // ans += Math.min(aCnt, bCnt) + abCnt;
        // } else {
        // long res1 = (abCnt + Math.abs(aCnt - bCnt) + 1) / 2 + Math.min(aCnt, bCnt);
        // abCnt -= Math.abs(aCnt - bCnt);
        // long res2 = Math.max(aCnt, bCnt) + (abCnt + 1) / 2;
        // ans += Math.max(res1, res2);
        // }

        long k = (abCnt + 1) / 2;
        if (abCnt <= 1) {
            k = 0;
        }
        if (abCnt >= 1) {
            if (aCnt > 0) {
                k++;
                aCnt--;
            }
            if (bCnt > 0) {
                k++;
                bCnt--;
            }
        }
        ans += Math.min(aCnt, bCnt) + k;
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
