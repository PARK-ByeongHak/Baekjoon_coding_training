import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static char[][] stars;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        stars = new char[N][N];

        // 모든 칸을 공백으로 초기화
        for (int i = 0; i < N; i++) {
            Arrays.fill(stars[i], ' ');
        }

        // 별 찍기
        drawStars(0, 0, N);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(stars[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    private static void drawStars(int x, int y, int N) {
        // 기본 패턴일 경우 별 찍기
        if (N == 1) {
            stars[x][y] = '*';
            return;
        }

        int size = N / 3;
        int count = 0;
        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count != 5) { // 가운데 부분이 아닐 경우
                    drawStars(i, j, size);
                }
            }
        }
    }
}
