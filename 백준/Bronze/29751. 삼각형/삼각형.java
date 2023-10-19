import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, m;
        
        n = sc.nextInt();
        m = sc.nextInt();
        double o = (n*m)*0.5;

        System.out.printf("%.1f",o);
    }
}