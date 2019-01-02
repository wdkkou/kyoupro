import java.util.*;
public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        Point s = new Point(sc.nextInt() - 1, sc.nextInt() - 1);
        Point e = new Point(sc.nextInt() - 1, sc.nextInt() - 1);
        List<String> str = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            str.add(sc.next());
        }
        int[][] dist = bfs(s, str);
        // System.out.println(Arrays.deepToString(dist));
        System.out.println(dist[e.x][e.y]);
    }
    public static int[][] bfs(Point s, List<String> str) {
        int[][] dist = new int[51][51];
        for (int[] d : dist) {
            Arrays.fill(d, INF);
        }
        Queue<Point> que = new LinkedList<>();
        que.offer(s);
        dist[s.x][s.y] = 0;
        while (!que.isEmpty()) {
            Point p = que.poll();
            // System.out.println("p = " + p);
            for (int i = 0; i < 4; i++) {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];
                if (str.get(ny).charAt(nx) == '.' && dist[p.x][p.y] + 1 < dist[nx][ny]) {
                    dist[nx][ny] = dist[p.x][p.y] + 1;
                    //       System.out.printf("nx = %d ,ny = %d %n", nx, ny);
                    que.offer(new Point(ny, nx));
                }
            }
        }
        return dist;
    }
}
class Point {
    int x;
    int y;
    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }
    public String toString() {
        return String.format("(x = %d,y = %d)", this.x, this.y);
    }
}
