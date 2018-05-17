import java.util.Scanner;
public class MainB2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int [n+1];
        int left = 0;
        int right = 0;
        for(int i = 0;i < m;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < m;i++){
            if(a[i] < x){
                left++;
            }
            else{
                right++;
            }
        }
        if(left <= right){
            System.out.println(left);
        }
        else{
            System.out.println(right);
        }
    }
}
