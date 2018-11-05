import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        Map<Point, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Point p = new Point(sc.nextInt(), sc.nextInt());
            map.put(p, true);
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
}
