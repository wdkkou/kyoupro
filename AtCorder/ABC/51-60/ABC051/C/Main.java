import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int[] sxx = {sx,sx+1,sx-1,sx};
        int[] syy = {sy+1,sy,sy,sy-1};
        int[] txx = {tx-1,tx,tx,tx+1};
        int[] tyy = {ty,ty-1,ty+1,ty};
        StringBuilder d = new StringBuilder();
        for(int i = 0;i < 4;i++){
            if(i == 0){
                d.append("U");
                for(int j = syy[i];j < tyy[i];j++){
                    d.append("U");
                }
                for(int j = sxx[i];j < txx[i];j++){
                    d.append("R");
                }
                d.append("R");
            }
            if(i == 1){
                d.append("D");
                for(int j = syy[i];j < tyy[i];j++){
                    d.append("D");
                }
                for(int j = sxx[i];j < txx[i];j++){
                    d.append("L");
                }
                d.append("L");
            }
            if(i == 2){
                d.append("L");
                for(int j = syy[i];j < tyy[i];j++){
                    d.append("U");
                }
                for(int j = sxx[i];j < txx[i];j++){
                    d.append("R");
                }
                d.append("D");
            }
            if(i == 3){
                d.append("R");
                for(int j = syy[i];j < tyy[i];j++){
                    d.append("D");
                }
                for(int j = sxx[i];j < txx[i];j++){
                    d.append("L");
                }
                d.append("U");
            }
        }
        System.out.println(d);
    }
}
