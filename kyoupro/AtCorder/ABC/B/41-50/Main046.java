import java.util.Scanner;
public class Main046{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = K;
        for(int i = 1;i < N;i++){
            count *= K-1; 
        }
        System.out.println(count);
    }
}
