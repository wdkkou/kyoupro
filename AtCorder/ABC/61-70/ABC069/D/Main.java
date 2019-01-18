import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int[][] c = new int[h][w];
        int color = 1;
        int k = 0;
        int cnt = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a.get(k) <= cnt) {
                    cnt = 0;
                    color++;
                    k++;
                }
                c[i][j] = color;
                cnt++;
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i % 2 == 1) {
                    System.out.print(c[i][w - j - 1] + " ");
                } else {
                    System.out.print(c[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
