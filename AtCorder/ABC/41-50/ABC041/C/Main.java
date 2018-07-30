import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> a = new HashMap<>();
        for(int i = 0;i < n;i++){
            a.put(i+1,sc.nextInt());
        }

        List<Entry<Integer,Integer>> list_entries = new ArrayList<Entry<Integer,Integer>>(a.entrySet());
        Collections.sort(list_entries,new Comparator<Entry<Integer,Integer>>(){
            public int compare(Entry<Integer,Integer> obj1,Entry<Integer,Integer> obj2){
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        for(Entry<Integer,Integer> entry : list_entries){
            System.out.println(entry.getKey());
        }
    }
}
