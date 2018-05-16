import java.util.Scanner;
public class Main063{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        for(int i = 0;i < s.length();i++){
            for(int j = i+1;j < s.length();j++){
                if(str[i] == str[j]){
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }
}
