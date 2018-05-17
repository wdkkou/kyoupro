import java.util.Scanner;
public class Main052{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 0;
        int max = 0;
        String S = sc.next();
        for(int i = 0;i < N;i++){
            if(S.charAt(i) == 'I'){
                x++;
            }
            if(S.charAt(i) == 'D'){
                x--;
            }
            max = Math.max(max,x);
        }
        System.out.println(max);
    }
}
