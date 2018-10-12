import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PI =
            "314159265358979323846264338327950288419716939937510582097494459230781640628620899";
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(81);
            return;
        }
        String s = sc.next();
        boolean ok = false;
        int count = 0;
        for (int i = 0; i < PI.length(); i++) {
            for (int j = 0; j < n; j++) {
                if (PI.charAt(i) == s.charAt(j)) {
                    ok = true;
                }
            }
            if(ok){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
