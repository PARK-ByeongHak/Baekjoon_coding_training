import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int seed = scanner.nextInt();
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        for (int a = 0; a < m; a++) {
            for (int c = 0; c < m; c++) {
                if (x1 == (a * seed + c) % m && x2 == (a * x1 + c) % m) {
                    System.out.println(a + " " + c);
                    System.exit(0);
                }
            }
        }

        scanner.close();
    }
}
