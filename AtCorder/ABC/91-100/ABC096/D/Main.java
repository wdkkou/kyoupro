import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int j = 0;
        for(int i = 2;i <= 55555;i++){
            if(i % 5 == 1 && isPrime(i)){
                a[j++] = i;
            }
            if(j == N){
                break;
            }
        }
        for(int i = 0;i < N;i++){
            System.out.print(a[i]);
            if(i == N-1){
                break;
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    public static boolean isPrime(int x){
        if(x == 1){
            return false;
        }
        for(int i = 2;i < x;i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
