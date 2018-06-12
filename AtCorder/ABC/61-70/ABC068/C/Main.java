import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] bool1 = new boolean[n+1];
        boolean[] bool2 = new boolean[n+1];
        for(int i = 0;i < m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 1){
                bool1[b] = true;
            }
            if(b == n){
                bool2[a] = true;
            }
        }
        if(solve(bool1,bool2,n)){
            System.out.println("POSSIBLE");
            return;
        }
        System.out.println("IMPOSSIBLE");

    }
    public static boolean solve(boolean[] bool1,boolean[] bool2,int n){
        for(int i = 1;i <= n;i++){
            if(bool1[i] && bool2[i]){
                return true;
            }
        }
        return false;
    }
}
