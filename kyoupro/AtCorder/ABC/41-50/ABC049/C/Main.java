import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = reverse(s);
        String[] divide = {"dream","dreamer","erase","eraser"};
        for(int i = 0;i < 4;i++){
            divide[i] = reverse(divide[i]);
        }
        //System.out.println("divide = " + Arrays.toString(divide));
        //System.out.println("s = " + s);
        boolean can = true;
        for(int i = 0;i < s.length();){
            boolean can2 = false;
            for(int j = 0;j < 4;j++){
                String d = divide[j];
                //System.out.printf("divide[%d] = %s\n",j,d);
                if(i + d.length() <= s.length() && s.substring(i,i+d.length()).equals(d)){
                    can2 = true;
                    i += d.length();
                }
                //System.out.println("d = " + d.length());
                //System.out.println("i = " + i);
            }
            if(!can2){
                can = false;
                break;
            }
        }
        if(can){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
    public static String reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        String sr = new String(sb.reverse());
        return sr;
    }
}
