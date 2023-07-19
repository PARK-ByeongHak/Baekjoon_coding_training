import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if ((k - a) % d == 0 && (k - a) / d >= 0) {
            System.out.println((k - a) / d + 1);
        } else {
            System.out.println("X");
        }
    }
}
