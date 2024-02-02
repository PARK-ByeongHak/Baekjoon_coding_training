import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long p1 = scanner.nextLong();
        long q1 = scanner.nextLong();
        long p2 = scanner.nextLong();
        long q2 = scanner.nextLong();

        boolean isAreaInteger = (p1 * p2 % (q1 * q2 * 2) == 0);

        System.out.println(isAreaInteger ? 1 : 0);

        scanner.close();
    }
}
