import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine()); // 판 크기

        char[][] board = new char[N][];

        // 입력
        for (int i = 0; i < N; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }

        // 머리를 통해 심장 찾기
        boolean sign = false;
        int x = 0, y = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == '*') {
                    x = i + 2;
                    y = j + 1;
                    System.out.println(x + " " + y);
                    sign = true;
                    break;
                }
            }
            if (sign) {
                break;
            }
        }

        // 왼팔 검사
        int left_arm = 0;
        for (int i = 0; i < y - 1; i++) {
            if (board[x - 1][i] == '*') {
                left_arm++;
            }
        }

        // 오른팔 검사
        int right_arm = 0;
        for (int i = y; i < N; i++) {
            if (board[x - 1][i] == '*') {
                right_arm++;
            }
        }

        // 허리 검사
        int back = 0;
        int line = 0; // 허리 끝
        for (int i = x; i < N; i++) {
            if (board[i][y - 1] == '*') {
                back++;
                line = i;
            }
        }

        // 왼쪽 다리 검사
        // 밑에서부터 허리 끝까지 *이 있으면 갯수 세기
        int left_leg = 0;
        for (int i = N - 1; i > line; i--) {
            if (board[i][y - 2] == '*') {
                left_leg++;
            }
        }

        // 오른쪽 다리 검사
        int right_leg = 0;
        // 밑에서부터 허리 끝까지 *이 있으면 갯수 세기
        for (int i = N - 1; i > line; i--) {
            if (board[i][y] == '*') {
                right_leg++;
            }
        }

        System.out.println(left_arm + " " + right_arm + " " + back + " " + left_leg + " " + right_leg);

        scanner.close();
    }
}
