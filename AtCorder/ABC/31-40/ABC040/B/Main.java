import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 100000;
        for(int i = 1;i*i <= n;i++){
            int j = n/i;
            if(n-i*j < 0){
                continue;
            }
            //System.out.printf("i = %d,j = %d%n",i,j);
            min = Math.min(min,(n-i*j)+Math.abs(i-j));
        }
        System.out.println(min);
    }
}
