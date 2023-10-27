import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDays = scanner.nextInt();
        int priceInit = scanner.nextInt();

        for (int i = 1; i < totalDays; i++) {
            int priceDaily = scanner.nextInt();
            priceInit += priceDaily;
        }

        System.out.println(priceInit);
    }
}
