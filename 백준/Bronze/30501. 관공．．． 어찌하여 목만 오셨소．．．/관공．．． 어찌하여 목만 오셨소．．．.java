import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine();
            if (name.contains("S")) {
                System.out.println(name);
            }
        }
    }
}
