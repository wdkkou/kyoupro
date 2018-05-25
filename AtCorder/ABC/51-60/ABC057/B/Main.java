import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[m];
        long[] d = new long[m];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i = 0;i < m;i++){
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        long dist;
        for(int i = 0;i < n;i++){
            int index = 0;
            long dmin = 500000000;
            for(int j = 0;j < m;j++){
                dist = Math.abs(a[i]-c[j]) + Math.abs(b[i]-d[j]);
                if(dist < dmin){
                    index = j+1;
                    dmin = dist;
                }
            }
            System.out.println(index);
        }
    }
}
