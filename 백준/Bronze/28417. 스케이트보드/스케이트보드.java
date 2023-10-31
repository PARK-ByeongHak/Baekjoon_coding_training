import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] totalScores = new int[N];

        for (int i = 0; i < N; i++) {
            int[] runScores = new int[2];
            int[] trickScores = new int[5];

            for (int j = 0; j < 2; j++) {
                runScores[j] = scanner.nextInt();
            }

            for (int j = 0; j < 5; j++) {
                trickScores[j] = scanner.nextInt();
            }

            Arrays.sort(trickScores);
            int runScore = Math.max(runScores[0], runScores[1]);
            int trickScore = trickScores[3] + trickScores[4];

            totalScores[i] = runScore + trickScore;
        }

        Arrays.sort(totalScores);
        int highestScore = totalScores[N - 1];
        System.out.println(highestScore);
    }
}
