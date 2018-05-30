import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;
        while(x > 0){
            i++;
            x -= i;
        }
        System.out.println(i);
    }
}
