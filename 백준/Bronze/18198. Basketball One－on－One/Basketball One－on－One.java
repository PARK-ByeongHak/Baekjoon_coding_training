import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gameRecord = sc.nextLine();

        int scoreA = 0;
        int scoreB = 0;
        int remainingPoints = 11;

        for (int i = 0; i < gameRecord.length(); i += 2) {
            char player = gameRecord.charAt(i);
            int points = Character.getNumericValue(gameRecord.charAt(i + 1));
            if (player == 'A') {
                scoreA += points;
            } else {
                scoreB += points;
            }
            if (scoreA >= remainingPoints || scoreB >= remainingPoints) {
                if (Math.abs(scoreA - scoreB) >= 2) {
                    System.out.println(scoreA > scoreB ? 'A' : 'B');
                    return;
                } else {
                    remainingPoints = Math.max(scoreA, scoreB) + 2;
                }
            }
        }

        System.out.println(scoreA > scoreB ? 'A' : 'B');
    }
}