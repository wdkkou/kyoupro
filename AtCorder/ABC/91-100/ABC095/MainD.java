import java.util.Arrays;
import java.util.Scanner;
public class MainD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        long[] x = new long[N];
        long[] v = new long[N];
        long[] oa = new long[N+1];
        long[] ob = new long[N+1];
        long[] oaReverse = new long[N+1];
        long[] obReverse = new long[N+1];
        for(int i = 0;i < N;i++){
            x[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }
        long length1 = 0;
        long length2 = 0;
        oa[0] = 0;
        ob[0] = 0;
        for(int i = 0;i < N;i++){
            length1 += v[i];
            length2 += v[N-i-1];
            oa[i+1] = Math.max(length1-x[i],oa[i]-x[i]);
            ob[i+1] = Math.max(length2-C+x[N-i-1],ob[i]-C+x[N-i-1]);
        }
        long sumOa = 0;
        int kyoriA = 0;
        for(int i = 0;i < N;i++){
            if(oa[i] > oa[i+1]){
                //System.out.println("oa["+ i +"] = "+oa[i]);
                sumOa += oa[i];
                //System.out.println("sumOa = "+sumOa);
                kyoriA = i;
                //System.out.println("x["+ i + "] = "+x[i]);
                break;
            }
        }
        long sumOb = 0;
        int kyoriB = 0;
        for(int i = 0;i < N;i++){
            if(ob[i] > ob[i+1]){
                //System.out.println("ob["+ i +"] = "+ob[i]);
                sumOb += ob[i];
                kyoriB = i;
                //System.out.println("x["+ (N-i-1) + "]"+x[N-i-1]);
                break;
            }
        }
        long cal;
        if(sumOb == 0){
            cal = sumOa;
        }
        else{
            cal = sumOa + sumOb - x[kyoriA-1];
            //System.out.println(kyoriA);
        }
        System.out.println(cal);
        long calReverse;
        if(sumOa == 0){
            calReverse = sumOb;
        }
        else{
            calReverse = sumOa + sumOb - C + x[N-kyoriB+1];
            //System.out.println("x = "+x[kyoriB]);
        }
        System.out.println(Math.max(cal,calReverse));
        //System.out.println(Arrays.toString(oa));
        //System.out.println(Arrays.toString(ob));
    }
}

