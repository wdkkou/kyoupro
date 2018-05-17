import java.util.Scanner;
public class Main079{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int A = x/1000;
        x %= 1000;
        int B = x/100;
        x %= 100;
        int C = x/10;
        x %= 10;
        int D = x;
        if(A + B + C + D == 7){
            System.out.printf("%d+%d+%d+%d=7\n",A,B,C,D);
            return;
        }
        if(A + B + C - D == 7){
            System.out.printf("%d+%d+%d-%d=7\n",A,B,C,D);
            return;
        }
        if(A + B - C + D == 7){
            System.out.printf("%d+%d-%d+%d=7\n",A,B,C,D);
            return;
        }
        if(A + B - C - D == 7){
            System.out.printf("%d+%d-%d-%d=7\n",A,B,C,D);
            return;
        }
        if(A - B + C + D == 7){
            System.out.printf("%d-%d+%d+%d=7\n",A,B,C,D);
            return;
        }
        if(A - B + C - D == 7){
            System.out.printf("%d-%d+%d-%d=7\n",A,B,C,D);
            return;
        }
        if(A - B - C + D == 7){
            System.out.printf("%d-%d-%d+%d=7\n",A,B,C,D);
            return;
        }
        if(A - B - C - D == 7){
            System.out.printf("%d-%d-%d-%d=7\n",A,B,C,D);
            return;
        }
    }
}
