import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int testCase = 1; testCase <= t; testCase++) {
            int[][] sudoku = new int[9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = scanner.nextInt();
                }
            }

            System.out.print("Case " + testCase + ": ");
            if (isCorrectSudoku(sudoku)) {
                System.out.println("CORRECT");
            } else {
                System.out.println("INCORRECT");
            }

            // Skip empty line between test cases
            if (testCase < t) {
                scanner.nextLine(); // Read and ignore the empty line
            }
        }
    }

    private static boolean isCorrectSudoku(int[][] sudoku) {
        // Check rows and columns
        for (int i = 0; i < 9; i++) {
            if (!isValidGroup(sudoku[i]) || !isValidGroup(getColumn(sudoku, i))) {
                return false;
            }
        }

        // Check 3x3 subgrids
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidGroup(getSubgrid(sudoku, i, j))) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidGroup(int[] group) {
        boolean[] seen = new boolean[10]; // 1 to 9

        for (int num : group) {
            if (seen[num]) {
                return false; // Duplicate found
            }
            seen[num] = true;
        }

        return true;
    }

    private static int[] getColumn(int[][] sudoku, int colIndex) {
        int[] column = new int[9];
        for (int i = 0; i < 9; i++) {
            column[i] = sudoku[i][colIndex];
        }
        return column;
    }

    private static int[] getSubgrid(int[][] sudoku, int startRow, int startCol) {
        int[] subgrid = new int[9];
        int index = 0;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                subgrid[index++] = sudoku[i][j];
            }
        }

        return subgrid;
    }
}
