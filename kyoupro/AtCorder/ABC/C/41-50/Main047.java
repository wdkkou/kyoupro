import java.util.Scanner;
public class Main047{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char mark = s.charAt(0);
        int count = 0;
        for(int i = 1;i < s.length();i++){
            if(mark != s.charAt(i)){
                count++;
                mark = s.charAt(i);
            }
        }
        System.out.println(count);
    }
}
