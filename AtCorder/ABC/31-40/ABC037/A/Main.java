import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        int max = 0;
        for (int i = 0; i * a <= c; i++) {
            for (int j = 0; i * a + j * b <= c; j++) {
                if (i * a + j * b <= c) {
                    cnt = i + j;
                }
                max = Math.max(max, cnt);
            }
        }
        System.out.println(max);
    }
}
