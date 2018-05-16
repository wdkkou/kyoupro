import java.util.Scanner;
public class Main091{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] blue = new String[N];
        for(int i = 0;i < N;i++){
            blue[i] = sc.next();
        }
        int M = sc.nextInt();
        String[] red= new String[M];
        for(int i = 0;i < M;i++){
            red[i] = sc.next();
        }
        int max = 0;
        for(int i = 0;i < N;i++){
            int num = 1;
            for(int j = i+1;j < N;j++){
                if(blue[i].equals(blue[j])){
                    num++;
                }
            }
            for(int j = 0;j < M;j++){
                if(blue[i].equals(red[j])){
                    num--;
                }
            }
            if(max <= num){
                max = num;
            }
        }
        System.out.println(max);
    }
}
