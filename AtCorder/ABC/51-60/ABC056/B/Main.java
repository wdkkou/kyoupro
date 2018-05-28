import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int right = Math.max(a,b);
        int left = Math.min(a,b);
        if(left+w <= right){
            System.out.println(right-(left+w));
        }
        else{
            System.out.println(0);
        }
    }
}
