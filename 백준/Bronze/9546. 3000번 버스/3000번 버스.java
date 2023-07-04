import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int x = sc.nextInt();
            double res = Math.pow(2.0, x) - 1;
            System.out.printf("%.0f\n", res);
        }
        sc.close();
    }
}
