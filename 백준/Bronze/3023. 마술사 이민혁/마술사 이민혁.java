import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); // 행 개수
        int C = sc.nextInt(); // 열 개수

        char[][] design = new char[R][C];
        for (int i = 0; i < R; i++) {
            String row = sc.next();
            for (int j = 0; j < C; j++) {
                design[i][j] = row.charAt(j);
            }
        }

        int A = sc.nextInt(); // 에러 위치 행
        int B = sc.nextInt(); // 에러 위치 열

        // 카드 뒷 면 디자인 구하기
        char[][] card = new char[2 * R][2 * C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                card[i][j] = design[i][j]; // 왼쪽 위
                card[2 * R - 1 - i][j] = design[i][j]; // 오른쪽 위
                card[i][2 * C - 1 - j] = design[i][j]; // 왼쪽 아래
                card[2 * R - 1 - i][2 * C - 1 - j] = design[i][j]; // 오른쪽 아래
            }
        }

        // 에러 위치 처리
        if (card[A - 1][B - 1] == '#') {
            card[A - 1][B - 1] = '.';
        } else {
            card[A - 1][B - 1] = '#';
        }

        // 결과 출력
        for (int i = 0; i < 2 * R; i++) {
            for (int j = 0; j < 2 * C; j++) {
                System.out.print(card[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
