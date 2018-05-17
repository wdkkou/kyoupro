import java.util.Scanner;
public class MainC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int total = CorAtoB(A,B,C,X,Y);
        if(X > Y){
            total += CorA(A,C,X,Y);
        }
        else if(X < Y){
            total += CorA(B,C,X,Y);
        }
        System.out.println(total);

    }
    public static int CorA(int A,int C,int X,int Y){
        int total = 0;
        for(int i = 0;i < absolute(X,Y);i++){
            if(A <= 2*C){
                total += A;
            }
            else{
                total += 2*C;
            }
        }
        return total;
    }
    public static int CorAtoB(int A,int B,int C,int X,int Y){
        int total = 0;
        for(int i = 0;i < min(X,Y);i++){
            if(A + B > 2*C){
                total += 2*C;
            }
            else{
                total += A+B;
            }
        }
        return total;
    }
    public static int min(int X,int Y){
        if(X > Y){
            return Y;
        }
        else{
            return X;
        }
    }
    public static int absolute(int X,int Y){
        int z;
        if(X > Y){
            z = X - Y;
        }
        else{
            z = Y - X;
        }
        return z;
    }
}
