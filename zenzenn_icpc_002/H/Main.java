import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        List<Long> seven = new ArrayList<>();
        for (long i = 6; i <= 300000; i += 7) {
            seven.add(i);
            if (i + 2 > 300000) {
                break;
            }
            seven.add(i + 2);
        }
        boolean[] sevenPrime = new boolean[300001];
        for (long num : seven) {
            if (!isPrime(num)) {
                continue;
            }
            sevenPrime[(int) num] = true;
        }
        while (true) {
            long n = sc.nextLong();
            if (n == 1) {
                return;
            }
            List<Integer> ans = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                if (!sevenPrime[i]) {
                    continue;
                }
                if (n % i == 0) {
                    ans.add(i);
                }
            }
            System.out.print(n + ":");
            for (long a : ans) {
                System.out.printf(" %d", a);
            }
            System.out.println();
            // System.out.println("Seven");
            // System.out.println(seven);
            // System.out.println("sevenPrime");
            // System.out.println(sevenPrime);
            // System.out.println("ans");
            // System.out.println(ans);
        }
    }

    public static boolean isSeven(long x) {
        if (x % 7 == 1 || x % 7 == 6) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(long x) {
        if (x == 1) {
            return false;
        }
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0 && isSeven(i)) {
                return false;
            }
        }
        return true;
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
