import java.util.Scanner;
public class Main068{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soeji = 1;
        int max = 0;
        for(int i=1;i<=N;i++){
            int x = i;
            int count=0;
            while(x % 2 == 0){
                count++;
                x = x / 2;
            }
            if(count > max){
                max = count;
                soeji = i;
            }
        }
        System.out.println(soeji);
    }
}
