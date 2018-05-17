import java.util.Scanner;
public class Main045{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length()-1;
        long ans = 0;
        for(int i = 0;i < (1 << n);i++){
            String x = ""+S.charAt(0);
            long sum = 0;
            for(int j = 0;j < n;j++){
                if((i & (1<<j)) >= 1){
                    x += "+" + S.charAt(j+1);
                }
                else{
                    x += S.charAt(j+1);
                }
            }
            String[] split = x.split("\\+");
            for(int j = 0;j < split.length;j++){
                sum += Long.valueOf(split[j]);
            }
            ans += sum;
        }
        System.out.println(ans);
    }
}
