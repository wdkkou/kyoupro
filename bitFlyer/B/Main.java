import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        String x = sc.next();
        for(int i = 0;i < n;i++){
            char action = x.charAt(i);
            if(action == 'S'){
                if(A <= 0){
                    continue;
                }
                A--;
            }
            if(action == 'C'){
                if(B <= 0){
                    continue;
                }
                B--;
            }
            if(action == 'E'){
                if(A <= 0 && B <= 0){
                    continue;
                }
                if(A == B && A >= 1 && B >= 1){
                    A--;
                }
                else if(A > B){
                    A--;
                }
                else if(A < B){
                    B--;
                }
            }
        }
        System.out.println(A);
        System.out.println(B);
    }
}
