import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Point> red = new ArrayList<>();
        for(int i = 0;i < n;i++){
            Point x = new Point(sc.nextInt(),sc.nextInt());
            red.add(x);
        }
        List<Point> blue = new ArrayList<>();
        for(int i = 0;i < n;i++){
            Point x = new Point(sc.nextInt(),sc.nextInt());
            blue.add(x);
        }
        Collections.sort(red,new PointComparator());
        Collections.sort(blue,new PointComparator());

        long ans = 0;
        for(Point p : blue){
            Point max = null;
            for(Point q : red){
                if(q.x < p.x && q.y < p.y){
                    if(max == null || max.y < q.y){
                        max = q;
                    }
                }
            }
            if(max != null){
                ans++;
                red.remove(max);
            }
        }
        System.out.println(ans);
    }

    static class Point{
        int x;
        int y;
        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    static class PointComparator implements Comparator<Point>{
        public int compare(Point p1,Point p2){
            return p1.x - p2.x;
        }
    }
}
