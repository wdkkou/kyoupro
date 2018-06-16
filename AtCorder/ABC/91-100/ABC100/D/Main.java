import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Long> x = new ArrayList<>();
        List<Long> y = new ArrayList<>();
        List<Long> z = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            x.add(sc.nextInt());
            y.add(sc.nextInt());
            z.add(sc.nextInt());
        }
        long dp[] = new long[];
        dp[0] = 0;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                dp[i] = Math.max(dp[i-1],x.get(j)+y.get(j)+z.get(j));
            }
        }
        System.out.println(dp[n]);
    }
}
