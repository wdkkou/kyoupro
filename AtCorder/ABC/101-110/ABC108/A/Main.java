import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int parity = k / 2;
        if (k % 2 == 0) {
            System.out.println(parity * parity);
            return;
        }
        System.out.println(parity * (parity + 1));
    }
}
