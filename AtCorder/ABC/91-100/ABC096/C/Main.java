import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] str = new String[H];
        for(int i = 0;i < H;i++){
            str[i] = sc.next();
        }
        char[][] s = new char[H][W];
        for(int i = 0;i < H;i++){
            s[i] = str[i].toCharArray();
        }
        int[][] num = new int[H][W];
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};
        for(int i = 0;i < H;i++){
            for(int j = 0;j < W;j++){
                if(s[i][j] == '.'){
                    continue;
                }
                boolean can = false;
                if(s[i][j] == '#'){
                    for(int k = 0;k < 4;k++){
                        int ni = i + dy[k];
                        int nj = j + dx[k];
                        if(nj < 0 || nj >= W){
                            continue;
                        }
                        if(ni < 0 || ni >= H){
                            continue;
                        }
                        if(s[ni][nj] == '#'){
                            can = true;
                        }
                    }
                }
                if(!can){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
