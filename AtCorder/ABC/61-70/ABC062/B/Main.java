import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        List<String> a = new ArrayList<>();
        for(int i = 0;i < h;i++){
            a.add(sc.next());
        }
        for(int i = 0;i < w+2;i++){
            System.out.print("#");
        }
        System.out.println();

        for(String str : a){
            System.out.printf("#%s#\n",str);
        }

        for(int i = 0;i < w+2;i++){
            System.out.print("#");
        }
        System.out.println();
    }
}
