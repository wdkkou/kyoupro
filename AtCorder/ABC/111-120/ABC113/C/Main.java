import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> yearList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int index = sc.nextInt();
            int year = sc.nextInt();
            yearList.add(year);
            indexList.add(index);
            if (!map.containsKey(index)) {
                List<Integer> list = new ArrayList<>();
                map.put(index, list);
            }
            map.get(index).add(year);
        }

        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                continue;
            }
            Collections.sort(map.get(i));
        }
        System.out.println(map);
    }
}
