import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0) != 'A'){
            System.out.println("WA");
            return;
        }
        int cnt = 0;
        boolean can = false;
        for(int i = 1;i < s.length();i++){
            if(s.charAt(i) == 'C' && (i == s.length()-1 || i == 1)){
                can = false;
                break;
            }
            if(s.charAt(i) == 'C'){
                can = true;
                cnt++;
                if(cnt >= 2){
                    can = false;
                    break;
                }
                continue;
            }
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                can = false;
                break;
            }
        }
        if(can){
            System.out.println("AC");
            return;
        }
            System.out.println("WA");
    }
}
