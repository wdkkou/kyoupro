import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1;i*i*i*i <= x;i++){
            if(i*i*i*i == x){
                System.out.println(i);
                return;
            }
        }
    }
}
