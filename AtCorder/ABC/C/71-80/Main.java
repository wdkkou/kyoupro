import java.util.Scanner;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Boolean> map= new HashMap<Integer,Boolean>();
        int N = sc.nextInt();
        int[] a = new int [N];
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < N;i++){
            if(map.containsKey(a[i]) && map.get(a[i])){
                map.put(a[i],false);
            }
            else{
                map.put(a[i],true);
            }
        }
        int count = 0;
        for(Integer key : map.keySet()){
            if(map.get(key)){
                count++;
            }
        }
        System.out.println(count);
    }
}
