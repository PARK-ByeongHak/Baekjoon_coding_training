import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num >= 10) {
                num = (num + 5) / 10 * 10;
            }
            if (num >= 100) {
                num = (num + 50) / 100 * 100;
            }
            if (num >= 1000) {
                num = (num + 500) / 1000 * 1000;
            }
            if (num >= 10000) {
                num = (num + 5000) / 10000 * 10000;
            }
            if (num >= 100000) {
                num = (num + 50000) / 100000 * 100000;
            }
            if (num >= 1000000) {
                num = (num + 500000) / 1000000 * 1000000;
            }
            if (num >= 10000000) {
                num = (num + 5000000) / 10000000 * 10000000;
            }

            System.out.println(num);
        }
    }
}
