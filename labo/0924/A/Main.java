import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ma = sc.nextInt();
        int mb = sc.nextInt();
        int mc = sc.nextInt();
        int la = sc.nextInt();
        int lb = sc.nextInt();
        int lc = sc.nextInt();
        int ca = la / ma;
        int cb = lb / mb;
        int cc = lc / mc;
        System.out.println(Math.min(ca,Math.min(cb,cc)));
    }
}
