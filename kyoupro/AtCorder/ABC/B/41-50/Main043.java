import java.util.Scanner;
public class Main043{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        char[] p = new char[s.length()];
        int x = 0;
        for(int i = 0;i < s.length();i++){
            if(c[i] == 'B'){
                x--;
                if(x < 0){
                    x = 0;
                }
                continue;
            }
            p[x] = c[i];
            x++;
        }
        for(int i = 0;i < x;i++){
            System.out.print(p[i]);
        }
        System.out.println();
    }
}
