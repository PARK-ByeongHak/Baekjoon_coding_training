import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int absolute = 0;

        for (int i : scores) {
            if (i >= y) {
                absolute++;
            }
        }

        System.out.println((n * x / 100) + " " + absolute);
    }
}
