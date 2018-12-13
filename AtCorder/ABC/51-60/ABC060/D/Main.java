import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        Map<Long, List<Long>> map = new HashMap<>();
        List<Long> wList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long weight = sc.nextLong();
            long value = sc.nextLong();
            if (!map.containsKey(weight)) {
                map.put(weight, new ArrayList<>());
            }
            if (i == 0) {
                wList.add(weight);
            }
            map.get(weight).add(value);
        }

        List<Integer> wCnt = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            long x = wList.get(0) + i;
            if (!map.containsKey(x)) {
                wCnt.add(0);
                continue;
            }
            wCnt.add(map.get(x).size());
        }

        for (int i = 1; i < 4; i++) {
            wList.add(wList.get(0) + i);
        }

        // System.out.println(map);
        // System.out.println(wList);
        // System.out.println(wCnt);
        for (Map.Entry<Long, List<Long>> entry : map.entrySet()) {
            Collections.sort(entry.getValue(), Collections.reverseOrder());
        }
        //System.out.println(map);

        long ans = 0;
        for (int w1 = 0; w1 <= wCnt.get(0); w1++) {
            for (int w2 = 0; w2 <= wCnt.get(1); w2++) {
                for (int w3 = 0; w3 <= wCnt.get(2); w3++) {
                    for (int w4 = 0; w4 <= wCnt.get(3); w4++) {
                        // System.out.printf("w1 %d w2 %d w3 %d w4 %d %n", w1, w2, w3, w4);
                        long wsum = w1 * wList.get(0) + w2 * wList.get(1) + w3 * wList.get(2)
                            + w4 * wList.get(3);
                        if (wsum > w) {
                            continue;
                        }
                        ans = Math.max(ans, solve(map, wList, w1, w2, w3, w4));
                    }
                }
            }
        }
        System.out.println(ans);
    }
    public static long solve(
        Map<Long, List<Long>> map, List<Long> wList, int w1, int w2, int w3, int w4) {
        long ans = 0;

        for (int i = 1; i <= w1; i++) {
            ans += map.get(wList.get(0)).get(i - 1);
        }
        for (int i = 1; i <= w2; i++) {
            ans += map.get(wList.get(1)).get(i - 1);
        }
        for (int i = 1; i <= w3; i++) {
            ans += map.get(wList.get(2)).get(i - 1);
        }
        for (int i = 1; i <= w4; i++) {
            ans += map.get(wList.get(3)).get(i - 1);
        }
        return ans;
    }
}
