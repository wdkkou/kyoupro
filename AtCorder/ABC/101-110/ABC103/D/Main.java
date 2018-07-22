import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Comparator;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.put(a,b);
        }
        List<Entry<Integer,Integer>> entries = 
            new ArrayList<Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(entries, new Comparator<Entry<Integer,Integer>>() {
            @Override
            public int compare(
                    Entry<Integer,Integer> entry1, Entry<Integer,Integer> entry2) {
                return ((Integer)entry1.getValue()).compareTo((Integer)entry2.getValue());
                    }
        });
        long count = 0;
        int i = 0;
        int x = 0;
        for(Entry<Integer,Integer> entry : entries){
            System.out.printf("key = %d ,cnt = %d\n",entry.getKey(),count);
            if(i == 0){
                x = entry.getValue()-1;
                count++;
            }
            if(entry.getKey()<= x){
                i++;
                continue;
            }
            x = entry.getValue()-1;
            i++;
            count++;
        }
        System.out.println(count);
    }
}
