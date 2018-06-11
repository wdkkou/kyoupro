import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> t = new ArrayList<>();
        for(int i = 0;i < n;i++){
            t.add(sc.nextLong());
        }
        long answer = t.get(0);
        for(int i = 1;i < n;i++){
            answer = solve(answer,t.get(i));
        }
        System.out.println(answer);
    }
    public static long solve(long x,long y){
        List<Integer> ruijouX = new ArrayList<>();
        List<Integer> ruijouY = new ArrayList<>();
        List<Integer> ruijou = new ArrayList<>();
        ruijouX.add(0);
        ruijouX.add(0);
        ruijouY.add(0);
        ruijouY.add(0);
        ruijou.add(0);
        ruijou.add(0);
        ruijouX = create(ruijouX,x);
        System.out.println(ruijouX);
        ruijouY = create(ruijouY,y);
        System.out.println(ruijouY);
        long base = 0;
        long answer = 0;
        for(Integer it : ruijouY){
            //System.out.printf("base = %d,it = %d\n",base,it);
            answer += base * it;
            base++;
        }
        return answer;
    }
    public static List<Integer> create(List<Integer> rui,long x){
        int i = 2;
        while(x > 1){
            if(!isPrime(i)){
                i++;
                continue;
            }
            int index = 0;
            while(x > 1 && x % i == 0){
                index++;
                x /= i;
            }
            rui.add(index);
            i++;
        }
        return rui;
    }
    public static boolean isPrime(long x){
        if(x == 1 && x == 2){
            return true;
        }
        for(long i = 2;i <= Math.sqrt(x);i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
