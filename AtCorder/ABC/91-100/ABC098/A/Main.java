import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int max = Math.max(sum,sub);
        int mul = a * b;
        max = Math.max(max,mul);
        System.out.println(max);
    }
}
