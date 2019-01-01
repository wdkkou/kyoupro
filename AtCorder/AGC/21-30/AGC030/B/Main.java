import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
        }
    }
}
