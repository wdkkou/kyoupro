import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] exist = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        boolean can = true;
        long cnt = 1;
        for(int i = 0;i < n;i++){
            if(a[i] % 2 == 0 && n % 2 == 0){
                can = false;
                break;
            }
            if(a[i] % 2 == 1 && n % 2 == 1){
                can = false;
                break;
            }
            if(exist[a[i]] >= 2){
                can = false;
                break;
            }
            if(exist[a[i]] >= 1 && a[i] == 0){
                can = false;
                break;
            }
            if(exist[a[i]] == 0 && a[i] != 0){
                exist[a[i]]++;
                cnt *= 2;
                cnt %= 1000000007;
            }
            else{
                exist[a[i]]++;
            }
        }
        if(can){
            System.out.println(cnt);
            return;
        }
        System.out.println(0);
    }
}
