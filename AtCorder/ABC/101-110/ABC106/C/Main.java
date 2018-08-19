import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        if(s.charAt(0) != '1'){
            System.out.println(s.charAt(0));
            return;
        }
        int cnt = 1;
        for(int i = 1;i < s.length();i++){
            if(s.charAt(i) == '1'){
                cnt++;
                continue;
            }
            break;
        }
        if(k <= cnt){
            System.out.println(1);
            return;
        }
        System.out.println(s.charAt(cnt));
    }
}
