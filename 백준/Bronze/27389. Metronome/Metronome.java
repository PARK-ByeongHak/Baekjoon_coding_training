import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        double revolutions = (double) n / 4.0;
        System.out.printf("%.2f", revolutions);
    }
}
