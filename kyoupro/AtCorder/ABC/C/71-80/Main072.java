import java.util.Scanner;
public class Main072{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }
        int x;
        int max = 0;
        int[] num = new int[100001];
        for(int i = 0;i < N ;i++){
            num[a[i]]++;
        }
        for(int j = 0;j < N;j++){
            x = a[j];
            int count = 0;
            if(x == 0){
                count = num[x] + num[x+1];
            }
            else{
                count = num[x] + num[x-1] + num[x+1];
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
