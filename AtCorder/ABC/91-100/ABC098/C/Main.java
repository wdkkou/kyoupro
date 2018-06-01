import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        List<Character> list = new ArrayList<>();

        for(int i = 0;i < n;i++){
            list.add(s.charAt(i));
        }
        List<Integer> w = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        if(s.charAt(0) == 'W'){
            w.add(1);
            e.add(0);
        }
        else{
            w.add(0);
            e.add(1);
        }
        for(int i = 0;i < n-1;i++){
            if(list.get(i+1) == 'W'){
                w.add(w.get(i)+1);
            }
            else{
                w.add(w.get(i));
            }
        }
        for(int i = 0;i < n-1;i++){
            if(list.get(i+1) == 'E'){
                e.add(e.get(i)+1);
            }
            else{
                e.add(e.get(i));
            }
        }
        int min = n;
        for(int i = 0;i < n;i++){
            int cnt = 0;
            int left = w.get(i);
            int right = e.get(n-1) - e.get(i);
            if(list.get(i) == 'W'){
                if(left > 0){
                    left--;
                }
            }
            //System.out.println("left = "+ left);
            //System.out.println("right = "+ right);
            cnt = left + right;
            //System.out.println("cnt = "+ cnt);
            min = Math.min(min,cnt);
        }
        System.out.println(min);
    }
}
