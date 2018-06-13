import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Long> a = new TreeMap<>();
        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            if(a.get(x) != null){
                a.put(x,a.get(x)+1L);
                continue;
            }
            a.put(x,1L);
        }
        List <Integer> list = new ArrayList<>(a.keySet());
        Collections.sort(list,Collections.reverseOrder());
        //System.out.println(list);
        long edge1 = 0;
        long edge2 = 0;
        for(Integer it : list){
            //System.out.println("it = " + it);
            if(a.get(it) < 2){
                continue;
            }
            else if(a.get(it) >= 2 && a.get(it) < 4){
                if(edge1 == 0){
                    edge1 = it;
                    continue;
                }
                edge2 = it;
                break;
            }
            else if(a.get(it) >= 4){
                if(edge1 != 0){
                    edge2 = it;
                    break;
                }
                edge1 = it;
                edge2 = it;
                break;
            }
        }
        System.out.println(edge1 * edge2);
    }
}
