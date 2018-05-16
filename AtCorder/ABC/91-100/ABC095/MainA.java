import java.util.Scanner;
import java.util.Arrays;
public class MainA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String top = sc.next();
        char[] flag = top.toCharArray();
        int sum = 700;
        for(int i = 0;i < top.length();i++){
            if(flag[i] == 'o'){
                sum += 100;
            }
        }
        System.out.println(sum);
    }
}
