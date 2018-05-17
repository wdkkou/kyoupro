import java.util.Arrays;
import java.util.Scanner;
public class Main071{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] str = S.toCharArray();
        int[] num = new int[26];
        for(int i = 0;i < S.length();i++){
            num[str[i] - 'a'] ++;
        }
        for(int i = 0;i < 26;i++){
            if(num[i] > 0){
                continue;
            }
            else{
                System.out.println((char)('a' + i));
                return;
            }
        }
        System.out.println("None");
    }
}
