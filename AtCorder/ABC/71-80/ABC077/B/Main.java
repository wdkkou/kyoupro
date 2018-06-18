import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for(int i = 1;i*i <= n;i++){
            if(i*i <= n){
                max = Math.max(max,i*i);
            }
        }
        System.out.println(max);
    }
}
