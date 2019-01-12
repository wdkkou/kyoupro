import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ans = (n - h + 1) * (n - w + 1);
        System.out.println(ans);
    }
}
