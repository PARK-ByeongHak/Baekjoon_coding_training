import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t1 = scanner.nextInt();
        int e1 = scanner.nextInt();
        int f1 = scanner.nextInt();

        int t2 = scanner.nextInt();
        int e2 = scanner.nextInt();
        int f2 = scanner.nextInt();

        int maxTime1 = t1 * 3 + e1 * 20 + f1 * 120; // Calculate total time for Max
        int maxTime2 = t2 * 3 + e2 * 20 + f2 * 120; // Calculate total time for Mel

        if (maxTime1 > maxTime2) {
            System.out.println("Max");
        } else if (maxTime2 > maxTime1) {
            System.out.println("Mel");
        } else {
            System.out.println("Draw");
        }
    }
}
