import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        int n = Integer.valueOf(nm[0]);
        int m = Integer.valueOf(nm[1]);

        Map<Integer, List<Pair>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] py = reader.readLine().split(" ");
            int pre = Integer.valueOf(py[0]);
            int year = Integer.valueOf(py[1]);
            if (!map.containsKey(pre)) {
                List<Pair> pairs = new ArrayList<>();
                map.put(pre, pairs);
            }
            Pair p = new Pair(i, year);
            map.get(pre).add(p);
        }
        for (Map.Entry<Integer, List<Pair>> entry : map.entrySet()) {
            Collections.sort(entry.getValue(), new PairComparator());
        }
        String[] ans = new String[m];
        for (Map.Entry<Integer, List<Pair>> entry : map.entrySet()) {
            int order = 0;
            for (Pair p : entry.getValue()) {
                order++;
                ans[p.city] = String.format("%06d%06d", entry.getKey(), order);
            }
        }

        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        for (String s : ans) {
            writer.println(s);
        }
        writer.flush();
    }
}
class Pair {
    int city;
    int year;
    public Pair(int city, int year) {
        this.city = city;
        this.year = year;
    }
    public int compareTo(Pair p) {
        return this.year - p.year;
    }
    public String toString() {
        return String.format("city : %d year: %d %n", this.city, this.year);
    }
}
class PairComparator implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        return p1.year - p2.year;
    }
}
