import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int length = 0;
        for(int i = 1;i < n;i++){
            if((n-i) % 2 != 0){
                continue;
            }
            String first = s.substring(0,(n-i)/2);
            String last = s.substring((n-i)/2,n-i);
            //System.out.println("first = "+ first);
            //System.out.println("last = "+last);
            if(first.equals(last)){
                length = first.length() + last.length();
                break;
            }
        }
        System.out.println(length);
    }
}
