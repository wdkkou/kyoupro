import java.util.Scanner;
import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Long> guu = new HashMap<>();
        Map<Integer, Long> kisu = new HashMap<>();
        guu.put(-1,0L);
        kisu.put(-1,0L);
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (i % 2 == 0) {
                if (guu.containsKey(x)) {
                    guu.put(x, guu.get(x) + 1L);
                    continue;
                }
                guu.put(x, 1L);
                continue;
            }
            if (kisu.containsKey(x)) {
                kisu.put(x, kisu.get(x) + 1L);
                continue;
            }
            kisu.put(x, 1L);
        }
        List<Entry<Integer, Long>> list_guu = createList(guu);
        List<Entry<Integer, Long>> list_kisu = createList(kisu);
        long ans1 = list_guu.get(0).getValue();
        long ans2 = list_kisu.get(0).getValue();
        if (list_guu.get(0).getKey() == list_kisu.get(0).getKey()) {
            ans1 += list_kisu.get(1).getValue();
        } else {
            ans1 += list_kisu.get(0).getValue();
        }
        if (list_guu.get(0).getKey() == list_kisu.get(0).getKey()) {
            ans2 += list_guu.get(1).getValue();
        } else {
            ans2 += list_guu.get(0).getValue();
        }
        long cnt = n - Math.max(ans1, ans2);
        System.out.println(cnt);
    }
    public static List<Entry<Integer, Long>> createList(Map<Integer, Long> map) {
        List<Entry<Integer, Long>> list_entries =
            new ArrayList<Entry<Integer, Long>>(map.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<Integer, Long>>() {
            public int compare(Entry<Integer, Long> obj1, Entry<Integer, Long> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        return list_entries;
    }
}
