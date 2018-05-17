import java.util.Scanner;
public class Main072{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        for(int i = 0;i < s.length();i++){
            if(i % 2 == 0){
                System.out.print(str[i]);
            }
        }
        System.out.println();
    }
}
