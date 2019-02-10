import java.util.*;
public class Main {
    static int[] v;
    static int[] dist;
    static int INF = 1000000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // List<Edge>[] g = new List[n + 1];
        List<List<Edge>> g = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }
        dist = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dist[i] = INF;
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            // g[l].add(new Edge(r, d));
            // g[r].add(new Edge(l, -d));
            g.get(l).add(new Edge(r, d));
            g.get(r).add(new Edge(l, -d));
        }
        if (bfs(g, n)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

    public static boolean bfs(List<List<Edge>> g, int n) {
        for (int i = 1; i <= n; i++) {
            if (dist[i] != INF) {
                continue;
            }
            Queue<Integer> que = new LinkedList<>();
            que.offer(i);
            dist[i] = 0;
            while (!que.isEmpty()) {
                int v = que.poll();
                for (Edge e : g.get(v)) {
                    if (dist[e.to] == INF) {
                        dist[e.to] = dist[v] + e.cost;
                        que.offer(e.to);
                    } else if (dist[e.to] != dist[v] + e.cost) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
class Edge {
    int to;
    int cost;
    public Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}
