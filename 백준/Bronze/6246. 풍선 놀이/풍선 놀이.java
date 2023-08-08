import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] balloonState = new String[N];

        for (int i = 0; i < Q; i++) {
            int L = scanner.nextInt();
            int I = scanner.nextInt();

            for (int index = L - 1; index < N; index += I) {
                balloonState[index] = "balloon";
            }
            scanner.nextLine(); // Consume the newline character
        }

        int blankSlot = 0;
        for (String slot : balloonState) {
            if (slot == null) {
                blankSlot++;
            }
        }

        System.out.println(blankSlot);
    }
}
