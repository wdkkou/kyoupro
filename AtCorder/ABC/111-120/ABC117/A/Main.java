import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float t = sc.nextFloat();
        float x = sc.nextFloat();
        float ans = t / x;
        System.out.printf("%.5f %n", ans);
    }
}
