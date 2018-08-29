import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        List<String> a = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            a.add(sc.next());
        }
        List<Boolean> row = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            row.add(false);
        }
        List<Boolean> col = new ArrayList<>();
        for (int i = 0; i < w; i++) {
            col.add(false);
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a.get(i).charAt(j) == '#') {
                    row.set(i, true);
                    col.set(j, true);
                    continue;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            if (!row.get(i)) {
                continue;
            }
            for (int j = 0; j < w; j++) {
                if (!col.get(j)) {
                    continue;
                }
                System.out.print(a.get(i).charAt(j));
            }
            System.out.println();
        }
    }
}
