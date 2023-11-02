import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            System.out.println(input.length());
        }
    }
}
