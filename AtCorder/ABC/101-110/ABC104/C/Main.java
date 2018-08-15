import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int g = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            p.add(sc.nextInt());
            c.add(sc.nextInt());
        }
        for (int i = 0; i < (1 << d); i++) {
            for(int j = 0;j < d;j++){
                if(i >> j & i){
                }
            }
        }
    }
}
