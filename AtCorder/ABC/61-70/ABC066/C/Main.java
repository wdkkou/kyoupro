import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        LinkedList<Integer> b = setList(a,n);
        for(Integer it : b){
            System.out.print(it);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static LinkedList<Integer> setList(List<Integer> a,int n){
        LinkedList<Integer> b = new LinkedList<>();
        int parity = n % 2;
        for(int i = 1;i <= n;i++){
            if(i % 2 == parity){
                b.addFirst(a.get(i-1));
            }
            else if(i % 2 != parity){
                b.addLast(a.get(i-1));
            }
        }
        return b;
    }
}
