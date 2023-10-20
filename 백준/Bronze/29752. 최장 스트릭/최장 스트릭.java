import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] problems = new int[N];

        for (int i = 0; i < N; i++) {
            problems[i] = scanner.nextInt();
        }

        int currentStreak = 0;
        int longestStreak = 0;

        for (int i = 0; i < N; i++) {
            if (problems[i] > 0) {
                currentStreak++;
                longestStreak = Math.max(longestStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }

        System.out.println(longestStreak);

        scanner.close();
    }
}
