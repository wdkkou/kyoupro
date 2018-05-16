import java.util.Scanner;
public class MainB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int [n+1];
        int[] bit = new int [m+2];
        int cost1 = 0;
        int cost2 = 0;
        for(int i = 1;i <= m;i++){
            bit[i] = sc.nextInt();
        }

        for(int i = 0;i < n+1;i++){
            a[i] = 0;
        }
        int j = 1;
        for(int i = 0;i < n+1;i++){
            if(j == m+1){
                break;
            }
            if(i == bit[j]){
                a[i] = 1;
                j++;
            }
        }
        for(int i = 0;i < x;i++){
            cost1 = cost1 + a[i];
        }
        for(int i = x+1;i < n+1;i++){
            cost2 = cost2 + a[i];
        }
        if(cost1 <= cost2){
            System.out.println(cost1);
        }
        else{
            System.out.println(cost2);
        }
    }
}
