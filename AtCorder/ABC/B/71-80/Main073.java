import java.util.Scanner;
public class Main073{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int number = 0;
        for(int i = 0;i < N;i++){
            for(int j = 0;j < b[i]-a[i]+1;j++){
                number++;
            }
        }
        System.out.println(number);
    }
}
