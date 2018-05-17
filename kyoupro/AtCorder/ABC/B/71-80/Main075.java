import java.util.Scanner;
import java.util.Arrays;
public class Main075{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] s = new String[H];
        for(int i = 0;i < H;i++){
            s[i] = sc.next();
        }
        char[][] c = new char[H][W];
        for(int i = 0;i < H;i++){
            c[i] = s[i].toCharArray();
        }
        int[][] num = new int[H][W];
        int[] dx = {1,0,-1,0,1,-1,-1,1};
        int[] dy = {0,1,0,-1,1,1,-1,-1};
        for(int i = 0;i < H;i++){
            for(int j = 0;j < W;j++){
                if(c[i][j] == '#'){
                    continue;
                }
                for(int k = 0;k < 8;k++){
                    int ni = i + dy[k];
                    int nj = j + dx[k];
                    if(ni < 0 || ni >= H){
                        continue;
                    }
                    if(nj < 0 || nj >= W){
                        continue;
                    }
                    if(c[ni][nj] == '#'){
                        num[i][j]++;
                    }
                }
            }
        }
        for(int i = 0;i < H;i++){
            for(int j = 0;j < W;j++){
                if(num[i][j] == 0 && c[i][j] == '#'){
                    System.out.print('#');
                    continue;
                }
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}
