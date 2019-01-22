import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int index = 1;
        while (n > 0) {
            n -= index;
            index++;
        }
        index--;
        int tmp = 0;
        for (int i = index; i > 0; i--) {
            tmp += index;
            if (tmp > num) {
                tmp -= index;
                index--;
                continue;
            }
            System.out.println(index);
            if (tmp == num) {
                break;
            }
            index--;
        }
    }
}
