import java.util.Scanner;
public class Main057{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int min = 10;
        long B = 1;
        for(long A = 1;A * A <= N;A++){
            if(N % A == 0){
                B = N / A;
            }
            if(digits(B) < min){
                min = digits(B);
            }
        }
        System.out.println(min);
    }
    public static int digits(long max){
        int count = 0;
        while(max != 0){
            max /= 10;
            count++;
        }
        return count;
    }
}
