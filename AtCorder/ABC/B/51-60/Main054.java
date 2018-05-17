import java.util.Scanner;
import java.util.Arrays;
public class Main054{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] a = new String[N];
        String[] b = new String[M];
        for(int i = 0;i < N;i++){
            a[i] = sc.next();
        }
        for(int i = 0;i < M;i++){
            b[i] = sc.next();
        }
        boolean exit = false;
        for(int i = 0;i <= N-M;i++){
            for(int j = 0;j <= N-M;j++){
                boolean can = true;
                for(int k = 0;k < M;k++){
                    for(int l = 0;l < M;l++){
                        if(a[i + k].charAt(j+l) != b[k].charAt(l)){
                            can = false;
                        }
                    }
                }
                if(can){
                    exit = true;
                    break;
                }
            }
        }
        if(exit){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
