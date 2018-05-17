import java.util.Scanner;
import java.util.Arrays;
public class Main042{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String[] str= new String [N];
        sc.nextLine();
        for(int i = 0;i < N;i++){
            str[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(str));
        String reg;
        for(int i = 0;i < L;i++){
            for(int j = 0;j < L;j++){
                if(str[i].charAt(0) > str[j].charAt(0)){
                    reg = str[i];
                    str[i] = str[j];
                    str[j] = reg;
                    System.out.print(i);
                    System.out.println(Arrays.toString(str));
                }
                if(str[i].charAt(0) == str[j].charAt(0)){
                }
            }
        }
        System.out.println(Arrays.toString(str));

        for(int i = 0;i < N;i++){
            System.out.print(str[i]);
        }
        System.out.println();
    }
}
