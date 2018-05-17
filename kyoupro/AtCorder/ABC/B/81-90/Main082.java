import java.util.Scanner;
import java.util.Arrays;
public class Main082{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        char[] x = change(cs);
        cs = change(cs);
        ct = change2(ct);

        String name1= new String(cs);
        String name2= new String(ct);
        //System.out.println("name1= " + name1);
        //System.out.println("name2= " + name2);
        if(name1.compareTo(name2) < 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static char[] change(char[] cs){
        char x;
        for(int i = 0;i < cs.length;i++){
            for(int j = i+1;j < cs.length;j++){
                if(cs[i] > cs[j]){
                    x = cs[i];
                    cs[i] = cs[j];
                    cs[j] = x;
                }
            }
        }
        //System.out.println(cs);
        return cs;
    }
    public static char[] change2(char[] cs){
        char x;
        for(int i = 0;i < cs.length;i++){
            for(int j = i+1;j < cs.length;j++){
                if(cs[i] < cs[j]){
                    x = cs[i];
                    cs[i] = cs[j];
                    cs[j] = x;
                }
            }
        }
        //System.out.println(cs);
        return cs;
    }
}
