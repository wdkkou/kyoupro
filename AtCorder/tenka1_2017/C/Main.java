import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (long h = 1; h <= 3500; h++) {
            for (long k = 1; k <= 3500; k++) {
                if (4 * h * k - n * (h + k) == 0) {
                    continue;
                }
                if (n * h * k % (4 * h * k - n * (h + k)) != 0) {
                    continue;
                }
                long w = n * h * k / (4 * h * k - n * (h + k));
                if(w <= 0){
                    continue;
                }
                System.out.printf("%d %d %d%n", h, k, w);
                return;
            }
        }
    }
}
