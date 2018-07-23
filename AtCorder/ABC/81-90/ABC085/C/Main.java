import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = sc.nextInt();
        for(int x = 0;x <= n;x++){
            for(int y = 0;y <= n;y++){
                int z = n - x - y;
                if(z < 0){
                    continue;
                }
                if(10000*x + 5000*y + 1000*z == total){
                    System.out.printf("%d %d %d\n",x,y,z);
                    return;
                }
            }
        }
        System.out.printf("%d %d %d\n",-1,-1,-1);
    }
}
