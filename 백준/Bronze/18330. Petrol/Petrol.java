import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int min =Math.min(b+60, a);
        
        System.out.println(min*1500 + (a-min)*3000);
    }
}
