import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for(int i = 0;i < n;i++){
            s += sc.next();
        }
        boolean p = false;
        boolean w = false;
        boolean g = false;
        boolean y = false;
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == 'P'){
                p = true;
            }
            if(s.charAt(i) == 'W'){
                w = true;
            }
            if(s.charAt(i) == 'G'){
                g = true;
            }
            if(s.charAt(i) == 'Y'){
                y = true;
            }
        }
        if(p & w & g & y){
            System.out.println("Four");
        }
        else if(p & w & g & !y){
            System.out.println("Three");
        }
    }
}
