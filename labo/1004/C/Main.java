import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int k = sc.nextInt();
        List<StringBuilder> s = new ArrayList<StringBuilder>();
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            StringBuilder sb = new StringBuilder(str);
            s.add(sb);
        }
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        int d = 0;
        int lx = w - x;
        int ly = y - 1;
        while (true) {
            if (k == 0) {
                System.out.printf("%d %d%n", w - lx, ly + 1);
                return;
            }
            //System.out.printf("%d %d %d %n", w - lx, ly + 1, k);
            if (lx + dx[d] < 0 || ly + dy[d] < 0 || lx + dx[d] > w - 1 || ly + dy[d] > h - 1) {
                d = (d + 1) % 4;
                k--;
                continue;
            }
            char ch = s.get(ly + dy[d]).charAt(lx + dx[d]);
            //System.out.printf("%s %n", ch);
            if (ch == '#') {
                d = (d + 1) % 4;
                k--;
                continue;
            } else {
                int num = Character.getNumericValue(ch);
                k += num;
                s.get(ly + dy[d]).setCharAt(lx + dx[d],'0');
            }
            lx += dx[d];
            ly += dy[d];
            k--;
        }
    }
}
