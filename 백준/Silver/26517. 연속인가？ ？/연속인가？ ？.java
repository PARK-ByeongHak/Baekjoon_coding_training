import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        long p1 = a * t + b;
        long p2 = c * t + d;

        System.out.println((p1 == p2) ? "Yes " + p1 : "No");

        scanner.close();
    }
}
