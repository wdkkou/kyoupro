import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long w = sc.nextInt();
        long ans = solve(h,w);
        System.out.println(ans);
    }
    public static long solve(long h,long w){
        long a = pattern1(h,w);
        long b = pattern2(h,w);
        long c = pattern3(h,w);
        long d = pattern4(h,w);
        return Math.min(a,Math.min(b,Math.min(c,d)));
    }
    public static long pattern1(long h,long w){
        long ans = Integer.MAX_VALUE;
        for(long i = 1;i <= h;i++){
            long sa = i*w;
            long ww = w/2;
            long sb = (h-i) * ww;
            long sc = (h-i) * (w-ww);
            long max = Math.max(sa,Math.max(sb,sc));
            long min = Math.min(sa,Math.min(sb,sc));
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
    public static long pattern2(long h,long w){
        long ans = Integer.MAX_VALUE;
        for(long i = 1;i <= h;i++){
            long sa = i*w;
            long half = (h-i)/2;
            long sb = half * w;
            long sc = (h-i-half) * w;
            long max = Math.max(sa,Math.max(sb,sc));
            long min = Math.min(sa,Math.min(sb,sc));
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
    public static long pattern3(long h,long w){
        long ans = Integer.MAX_VALUE;
        for(long i = 1;i <= w;i++){
            long sa = h*i;
            long hh = h/2;
            long sb = hh * (w-i);
            long sc = (h-hh) * (w-i);
            long max = Math.max(sa,Math.max(sb,sc));
            long min = Math.min(sa,Math.min(sb,sc));
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
    public static long pattern4(long h,long w){
        long ans = Integer.MAX_VALUE;
        for(long i = 1;i <= w;i++){
            long sa = h*i;
            long half = (w-i)/2;
            long sb = h * half;
            long sc = h * (w-i-half);
            long max = Math.max(sa,Math.max(sb,sc));
            long min = Math.min(sa,Math.min(sb,sc));
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
}
