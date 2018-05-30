import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int a_len = a.length();
        int b_len = b.length();
        if(a_len > b_len){
            System.out.println("GREATER");
        }
        if(a_len < b_len){
            System.out.println("LESS");
        }
        if(a_len == b_len){
            if(a.equals(b)){
                System.out.println("EQUAL");
            }
            else{
                for(int i = 0;i < a_len;i++){
                    if(a.charAt(i) > b.charAt(i)){
                        System.out.println("GREATER");
                        return;
                    }
                    if(a.charAt(i) < b.charAt(i)){
                        System.out.println("LESS");
                        return;
                    }
                }
            }
        }
    }
}
