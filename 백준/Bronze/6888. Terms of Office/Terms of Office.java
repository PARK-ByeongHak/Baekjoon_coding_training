import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();
        
        while (L <= R) {
            System.out.println("All positions change in year " + L);
            L += 60;
        }
    }
}