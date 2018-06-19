import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        int n = sc.nextInt();
        list.add(2L);
        list.add(1L);
        for(int i = 2;i <= n;i++){
            list.add(list.get(i-2)+list.get(i-1));
        }
        System.out.println(list.get(n));
    }
}
