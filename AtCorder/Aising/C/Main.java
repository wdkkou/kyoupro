import java.util.*;
public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int INF = 1000000000;
    static boolean[][] used;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        List<String> str = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            str.add(sc.next());
        }

        used = new boolean[w][h];
        long ans = 0;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (used[x][y]) {
                    continue;
                }
                Point p = new Point(x, y);
                ans += bfs(p, str);
            }
        }
        System.out.println(ans);
    }
    public static long bfs(Point s, List<String> str) {
        long b = 0;
        long w = 0;
        Queue<Point> que = new LinkedList<>();
        que.offer(s);
        used[s.x][s.y] = true;
        while (!que.isEmpty()) {
            Point p = que.poll();
            if (str.get(p.y).charAt(p.x) == '#') {
                b++;
            } else {
                w++;
            }
            // System.out.println("p = " + p);
            for (int i = 0; i < 4; i++) {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];
                char ch = str.get(p.y).charAt(p.x);
                if (nx < 0 || ny < 0 || nx >= str.get(0).length() || ny >= str.size()) {
                    continue;
                }
                if (!check(ch, str.get(ny).charAt(nx))) {
                    continue;
                }
                if (used[nx][ny]) {
                    continue;
                }
                used[nx][ny] = true;
                // System.out.printf("nx = %d ,ny = %d %n", nx, ny);
                que.offer(new Point(nx, ny));
            }
        }
        return b * w;
    }
    public static boolean check(char ch1, char ch2) {
        if (ch1 != ch2) {
            return true;
        }
        return false;
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
