import java.util.Scanner;
public class Main045{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        char[] cc = c.toCharArray();
        int ai = 0;
        int bi = 0;
        int ci = 0;
        char winner = 'a';
        char x = ac[ai];
        while(true){
            if(x == 'a'){
                if(ai >= a.length()){
                    winner = 'A';
                    break;
                }
                x = ac[ai];
                ai++;
            }
            if(x == 'b'){
                if(bi >= b.length()){
                    winner = 'B';
                    break;
                }
                x = bc[bi];
                bi++;
            }
            if(x == 'c'){
                if(ci >= c.length()){
                    winner = 'C';
                    break;
                }
                x = cc[ci];
                ci++;
            }
        }
        System.out.println(winner);
    }
}
