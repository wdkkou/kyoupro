import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Point p = new Point(sc.nextInt(), sc.nextInt());
            points.add(p);
        }
        Map<Point, Integer> map = new HashMap<>();
        for (Point p : points) {
            // System.out.printf("p : %s %n", p);
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    int nx = p.row - x;
                    int ny = p.line - y;
                    if (nx <= 0 || ny <= 0 || nx > w - 2 || ny > h - 2) {
                        continue;
                    }
                    Point point = new Point(nx, ny);
                    if (map.containsKey(point)) {
                        map.put(point, map.get(point) + 1);
                    } else {
                        map.put(point, 1);
                    }
                }
            }
        }

        long[] ans = new long[10];
        ans[0] = (long) (w - 2) * (h - 2);
        map.forEach((c, cnt) -> {
            ans[cnt]++;
            ans[0]--;
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(ans[i]);
        }
    }
}
class Point {
    int line;
    int row;
    public Point(int line, int row) {
        this.line = line;
        this.row = row;
    }
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point p = (Point) o;
        return this.line == p.line && this.row == p.row;
    }
    public int hashCode() {
        return Objects.hash(line, row);
    }
    public String toString() {
        return String.format("line = %s,row = %s", line, row);
    }
}
