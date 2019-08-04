import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String s = sc.next();
        int n = s.length();
        int[] ans = new int[n];
        int start = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'L') {
                int index = i;
                int end = n - 1;
                for (int j = i + 1; j < n - 1; j++) {
                    if (s.charAt(j) == 'L' && s.charAt(j + 1) == 'R') {
                        end = j;
                        break;
                    }
                }
                // System.out.println("start = " + start);
                // System.out.println("end = " + end);
                // System.out.println("index = " + index);
                if ((index - start) % 2 == 1) {
                    ans[index + 1] = (end - start + 2) / 2;
                    ans[index] = (end - start + 1) / 2;
                } else {
                    ans[index] = (end - start + 2) / 2;
                    ans[index + 1] = (end - start + 1) / 2;
                }
                i = end;
                start = end + 1;
            }
            // System.out.println(Arrays.toString(ans));
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]);
            if (i == n - 1) {
                break;
            }
            System.out.print(" ");
        }
        System.out.println();
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
