import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();

        double h = Math.sqrt(Math.pow(K, 2) - Math.pow((D1 - D2) / 2.0, 2));
        double result = Math.pow(h, 2);

        System.out.printf("%.6f",result);
    }
}
