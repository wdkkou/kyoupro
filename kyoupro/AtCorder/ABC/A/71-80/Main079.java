import java.util.Arrays;
import java.util.Scanner;
public class Main079{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int count = 1;
        for(int i = 0;i < 2;i++){
            //System.out.println("i:" + i + "hikaku:" + N.substring(i,i+1));
            //System.out.println("j:" + j + "hikaku:" + N.substring(j,j+1));
            if(N.charAt(i) == N.charAt(i+1) && N.charAt(i+1) == N.charAt(i+2)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
