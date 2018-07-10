import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        double d = sc.nextInt();
        double pro = 0.0;
        if(d == 0){
            pro = (m-1)/n;
        }
        else{
            pro = 2*(m-1)*(n-d) / (n*n);
        }
        System.out.printf("%.10f\n",pro);
    }
}
