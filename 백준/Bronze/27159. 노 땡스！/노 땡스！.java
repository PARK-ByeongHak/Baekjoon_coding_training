import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int score = calculateScore(cards);
        System.out.println(score);
    }

    private static int calculateScore(int[] cards) {
        int score = 0;
        int groupMin = cards[0];

        for (int i = 1; i < cards.length; i++) {
            if (cards[i] - cards[i - 1] > 1) {
                score += groupMin;
                groupMin = cards[i];
            }
        }

        score += groupMin;  // Add the minimum of the last group
        return score;
    }
}
