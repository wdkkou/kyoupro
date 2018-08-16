import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int g = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            p.add(sc.nextInt());
            c.add(sc.nextInt());
        }
        int min = 1001;
        for (int i = 0; i < (1 << d); i++) {
            int sum = 0;
            int num = 0;
            for (int j = 0; j < d; j++) {
                if ((i >> j & 1) == 1) {
                    sum += p.get(j) * (j + 1) * 100 + c.get(j);
                    num += p.get(j);
                    if (sum >= g) {
                        min = Math.min(min, num);
                    }
                }
            }
        //    System.out.printf("i = %d,sum = %d%n", i, sum);
        }

        int max = 0;
        int cnt = 0;
        for (int i = 0; i < d; i++) {
            for (int j = 1; j <= p.get(d - i - 1); j++) {
                max += (d - i) * 100;
                //   System.out.println(max);
                if (max >= g) {
                    min = Math.min(min, cnt + j);
                    //     System.out.println("==" + max);
                    //     System.out.println(min);
                }
            }
            max += c.get(d - i - 1);
            cnt += p.get(d - i - 1);
            // System.out.printf("min= %d,max= %d%n", min, max);
        }
        System.out.println(min);
    }
}
