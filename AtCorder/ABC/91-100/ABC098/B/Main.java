import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int maxcnt = 0;
        for(int i = 0;i < n;i++){
            String str1 = s.substring(0,i+1);
            String str2 = s.substring(i+1);
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            int cnt = count(c1,c2);
            maxcnt = Math.max(maxcnt,cnt);
        }
        System.out.println(maxcnt);
    }
    public static int count(char[] c1,char[] c2){
        int cnt = 0;
        for(int j = 0;j < c1.length;j++){
            if(j < c1.length -1 && c1[j] == c1[j+1]){
                continue;
            }
            for(int k = 0;k < c2.length;k++){
                if(c1[j] == c2[k]){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}
