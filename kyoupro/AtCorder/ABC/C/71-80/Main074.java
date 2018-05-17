import java.util.Scanner;
public class Main074{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        float E = sc.nextFloat();
        int F = sc.nextInt();
        float x;
        float y;
        float ans = 1;
        float sugar = 0;
        //water
        for(int i = 0;i <= F/100;i++){
            for(int j = 0;j <= F/100;j++){
                x = 100*A*i + 100*B*j;
                if(x == 0 || x > F){
                    continue;
                }
                //sugar
                for(int k = 0;k <= F;k++){
                    for(int l = 0;l <= F;l++){
                        y = C*k + D*l;
                        if(x + y <= F && y/(x + y) <= E / (E + 100) && y/(x + y) >= sugar/ans){
                            ans = x + y;
                            sugar = y;
                        }
                    }
                }
            }
        }
        System.out.println((int)ans + " " + (int)sugar);
    }
}
