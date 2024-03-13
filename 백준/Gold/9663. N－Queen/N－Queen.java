public class Main {
    private static int size;
    private static int count;
    private static int[] board;

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        size = sc.nextInt();
        board = new int[size];
        count = 0;

        placeQueen(0);
        System.out.println(count);
    }

    private static void placeQueen(int row) {
        if (row == size) {
            count++;
            return;
        }

        for (int col = 0; col < size; col++) {
            board[row] = col;
            if (isSafe(row)) {
                placeQueen(row + 1);
            }
        }
    }

    private static boolean isSafe(int row) {
        for (int i = 0; i < row; i++) {
            if (board[i] == board[row] || Math.abs(board[i] - board[row]) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}
