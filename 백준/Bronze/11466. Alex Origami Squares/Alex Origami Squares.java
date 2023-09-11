import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = scanner.nextDouble();
        double w = scanner.nextDouble();

        if (h < w) {
            double tmp = h;
            h = w;
            w = tmp;
        }

        if (h > w * 3) {
            System.out.printf("%.6f", w);
        } else if (h > w * 1.5) {
            System.out.printf("%.6f", h / 3);
        } else {
            System.out.printf("%.6f", w / 2);
        }
    }
}
