import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = createMap(sc,n);
        int free = 0;
        int min = 1;
        int max = 0;
        if(map.get("free") != null){
            free = map.get("free");
            if(map.size() > 1){
                min = map.size()-1;
                max = min + free;
            }
            else{
                max = free;
            }
        }
        else{
            min = map.size();
            max = map.size();
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static Map<String,Integer> createMap(Scanner sc,int n){
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            if(a >= 1 && a <= 399){
                if(map.get("gray") != null){
                    map.put("gray",map.get("gray"));
                }
                map.put("gray",1);
            }
            if(a >= 400 && a <= 799){
                if(map.get("brown") != null){
                    map.put("brown",map.get("brown"));
                }
                map.put("brown",1);
            }
            if(a >= 800 && a <= 1199){
                if(map.get("green") != null){
                    map.put("green",map.get("green"));
                }
                map.put("green",1);
            }
            if(a >= 1200 && a <= 1599){
                if(map.get("lightblue") != null){
                    map.put("lightblue",map.get("lightblue"));
                }
                map.put("lightblue",1);
            }
            if(a >= 1600 && a <= 1999){
                if(map.get("blue") != null){
                    map.put("blue",map.get("blue"));
                }
                map.put("blue",1);
            }
            if(a >= 2000 && a <= 2399){
                if(map.get("yellow") != null){
                    map.put("yellow",map.get("yellow"));
                }
                map.put("yellow",1);
            }
            if(a >= 2400 && a <= 2799){
                if(map.get("orange") != null){
                    map.put("orange",map.get("orange"));
                }
                map.put("orange",1);
            }
            if(a >= 2800 && a <= 3199){
                if(map.get("red") != null){
                    map.put("red",map.get("red"));
                }
                map.put("red",1);
            }
            if(a >= 3200 && a <= 4800){
                if(map.get("free") != null){
                    map.put("free",map.get("free")+1);
                    continue;
                }
                map.put("free",1);
            }
        }
        return map;
    }
}
