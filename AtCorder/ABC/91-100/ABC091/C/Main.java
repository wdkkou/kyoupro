import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();

        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
            b.add(sc.nextInt());
        }
        for(int i = 0;i < n;i++){
            c.add(sc.nextInt());
            d.add(sc.nextInt());
        }

        Set<Integer> setx = new HashSet<>();
        Set<Integer> sety = new HashSet<>();
        int cnt = 0;
        for(int i = 0;i < n;i++){
            int ax = a.get(i);
            for(int j = 0;j < n;j++){
                int cx = c.get(j);
                if(ax < cx){
                    int by = b.get(i);
                    int dy = d.get(j);

                    //System.out.println(Arrays.toString(setx.toArray()));
                    //System.out.println(Arrays.toString(sety.toArray()));
                    if(setx.contains(cx) && sety.contains(dy)){
                        continue;
                    }
                    if(by < dy){
                        cnt++;
                        System.out.printf("a %d b %d c %d d %d%n",ax,by,cx,dy);
                        setx.add(cx);
                        sety.add(dy);
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
