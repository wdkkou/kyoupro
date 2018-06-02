import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(8);
        set1.add(10);
        set1.add(12);

        set2.add(4);
        set2.add(6);
        set2.add(9);
        set2.add(11);


        set3.add(2);
        if(set1.contains(x) && set1.contains(y)){
            System.out.println("Yes");
            return;
        }
        if(set2.contains(x) && set2.contains(y)){
            System.out.println("Yes");
            return;
        }
        if(set3.contains(x) && set3.contains(y)){
            System.out.println("Yes");
            return;
        }
            System.out.println("No");
    }
}
