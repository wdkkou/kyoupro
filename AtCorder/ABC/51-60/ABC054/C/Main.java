import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0;i < m;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
    }
}
