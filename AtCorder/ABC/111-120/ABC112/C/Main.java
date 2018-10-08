import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
            y.add(sc.nextInt());
            h.add(sc.nextInt());
        }
        List<ArrayList<ArrayList<Long>>> ans = new ArrayList<ArrayList<ArrayList<Long>>>();
        long hight = 0;
        for (int m = 0; m < n; m++) {
            ArrayList<ArrayList<Long>> a = new ArrayList<ArrayList<Long>>();
            for (int i = 0; i <= 100; i++) {
                ArrayList<Long> xList = new ArrayList<>();
                for (int j = 0; j <= 100; j++) {
                    hight = h.get(m) + Math.abs(x.get(m) - i) + Math.abs(y.get(m) - j);
                    xList.add(hight);
                    System.out.println(hight);
                }
                a.add(xList);
            }
            ans.add(a);
        }
        long answer = 0;
        for (int i = 0; i <= 100; i++) {
            boolean exit = false;
            for (int j = 0; j <= 100; j++) {
                boolean ok = true;
                int index = 0;
                for (int m = 0; m < n - 1; m++) {
                    if (ans.get(m).get(i).get(j) != ans.get(m + 1).get(i).get(j)) {
                        ok = false;
                        continue;
                    }
                }
                if (true) {
                    answer = ans.get(0).get(i).get(j);
                    System.out.printf("%d, %d\n", i, j);
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
