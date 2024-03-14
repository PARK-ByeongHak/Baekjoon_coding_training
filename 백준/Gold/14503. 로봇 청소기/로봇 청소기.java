import java.util.Scanner;

public class Main {
    private static final int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    private static final int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[][] room = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                room[i][j] = sc.nextInt();
            }
        }

        int count = 0; // 청소하는 칸의 개수
        boolean[][] cleaned = new boolean[N][M]; // 청소 여부를 저장하는 배열

        while (true) {
            // 현재 위치를 청소한다.
            if (!cleaned[r][c]) {
                cleaned[r][c] = true;
                count++;
            }

            boolean moved = false;
            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4; // 반시계 방향으로 회전
                int nr = r + dx[d];
                int nc = c + dy[d];

                // 회전한 방향에 청소하지 않은 빈 칸이 있다면 전진
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && room[nr][nc] == 0 && !cleaned[nr][nc]) {
                    r = nr;
                    c = nc;
                    moved = true;
                    break;
                }
            }

            // 네 방향 모두 청소가 되어있거나 벽인 경우
            if (!moved) {
                // 바라보는 방향을 유지한 채로 한 칸 후진
                int nr = r - dx[d];
                int nc = c - dy[d];

                // 후진할 수 있는 경우
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && room[nr][nc] == 0) {
                    r = nr;
                    c = nc;
                } else {
                    // 후진할 수 없는 경우 작동을 멈춘다.
                    break;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
