import java.util.Scanner;
import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> guu = new HashMap<>();
        Map<Integer, Integer> kisu = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (i % 2 == 0) {
                if (guu.containsKey(x)) {
                    guu.put(x, guu.get(x) + 1);
                    continue;
                }
                guu.put(x, 1);
                continue;
            }
            if (kisu.containsKey(x)) {
                kisu.put(x, kisu.get(x) + 1);
                continue;
            }
            kisu.put(x, 1);
        }
        List<Entry<Integer, Integer>> list_guu = createList(guu);
        List<Entry<Integer, Integer>> list_kisu = createList(kisu);
        int max = 0;
        int cnt = 0;
        int cnt2 = 0;
        if (list_guu.get(0).getKey() == list_kisu.get(0).getKey()) {
            max = list_guu.get(0).getValue();
            cnt += n / 2 - max;
            if (list_kisu.size() == 1) {
                cnt += n / 2;
            } else {
                cnt += n / 2 - list_kisu.get(1).getValue();
            }
            max = list_kisu.get(0).getValue();
            cnt2 += n / 2 - max;
            if (list_guu.size() == 1) {
                cnt2 += n / 2;
            } else {
                cnt2 += n / 2 - list_guu.get(1).getValue();
            }
            System.out.println(Math.min(cnt, cnt2));
            return;
        }
        cnt += n / 2 - list_guu.get(0).getValue();
        cnt += n / 2 - list_kisu.get(0).getValue();
        System.out.println(cnt);
    }
    public static List<Entry<Integer, Integer>> createList(Map<Integer, Integer> map) {
        List<Entry<Integer, Integer>> list_entries =
            new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        return list_entries;
    }
}
