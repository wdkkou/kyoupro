import java.util.Scanner;
public class Main085{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        date = date.replaceAll("2017","2018");
        System.out.println(date);
    }
}
