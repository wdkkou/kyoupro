import java.util.Scanner;
public class Main042{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] d = new int[K];
        for(int i = 0;i < K;i++){
            d[i] = sc.nextInt();
        }
        boolean can = true;
        while(can){
            can = false;
            for(int i = 0;i < K;i++){
                if(String.valueOf(N).contains(String.valueOf(d[i]))){
                    can = true;
                    N++;
                    break;
                }
            }
        }
        System.out.println(N);
    }
}
