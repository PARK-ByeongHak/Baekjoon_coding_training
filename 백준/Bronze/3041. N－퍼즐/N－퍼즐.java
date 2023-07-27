import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] puzzle = new char[4][4];

        // 퍼즐 상태 입력 받기
        for (int i = 0; i < 4; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < 4; j++) {
                puzzle[i][j] = row.charAt(j);
            }
        }

        int totalDistance = 0;

        // 현재 퍼즐의 각 정사각형과 퍼즐을 풀었을 때의 위치와의 거리 계산
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                char square = puzzle[i][j];
                if (square == '.') continue; // 빈 칸은 거리 계산에서 제외

                int targetRow = (square - 'A') / 4; // 퍼즐을 풀었을 때의 목표 행 인덱스
                int targetCol = (square - 'A') % 4; // 퍼즐을 풀었을 때의 목표 열 인덱스

                int distance = Math.abs(i - targetRow) + Math.abs(j - targetCol);
                totalDistance += distance;
            }
        }

        System.out.println(totalDistance);
    }
}
