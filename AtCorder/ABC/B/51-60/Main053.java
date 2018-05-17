import java.util.Scanner;
public class Main053{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if(str[i] == 'A'){
                for(int j = s.length()-1;j > 0;j--){
                    if(str[j] == 'Z'){
                        System.out.println(j - i + 1);
                        return;
                    }
                }
            }
        }
    }
}
