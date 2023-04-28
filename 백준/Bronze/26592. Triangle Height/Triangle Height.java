import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double area = scanner.nextDouble();
            double base = scanner.nextDouble();
            double height = (2.0 * area) / base;
            System.out.printf("The height of the triangle is %.2f units\n", height);
        }
    scanner.close();
    }
}