import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] chessBoard = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String row = sc.next();
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = row.charAt(j);
            }
        }

        int whiteScore = 0;
        int blackScore = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char piece = chessBoard[i][j];
                if (piece == 'K') {
                    whiteScore += 0;
                } else if (piece == 'Q') {
                    whiteScore += 9;
                } else if (piece == 'R') {
                    whiteScore += 5;
                } else if (piece == 'B' || piece == 'N') {
                    whiteScore += 3;
                } else if (piece == 'P') {
                    whiteScore += 1;
                } else if (piece == 'k') {
                    blackScore += 0;
                } else if (piece == 'q') {
                    blackScore += 9;
                } else if (piece == 'r') {
                    blackScore += 5;
                } else if (piece == 'b' || piece == 'n') {
                    blackScore += 3;
                } else if (piece == 'p') {
                    blackScore += 1;
                }
            }
        }

        int result = whiteScore - blackScore;
        System.out.println(result);
    }
}
