import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = scanner.nextLine();
        }

        boolean isSatorMagicSquare = checkSatorMagicSquare(words, N);

        if (isSatorMagicSquare) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkSatorMagicSquare(String[] words, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (words[i].charAt(j) != words[j].charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
