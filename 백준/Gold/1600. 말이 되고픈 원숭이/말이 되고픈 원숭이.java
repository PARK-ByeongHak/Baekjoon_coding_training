import java.util.*;

public class Main {
    static int K;
    static int W, H;
    static int[][] map;
    static int[][][] visited;
    // 말의 움직임
    static int[] hx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] hy = {1, 2, 2, 1, -1, -2, -2, -1};
    // 상하좌우 움직임
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        W = sc.nextInt();
        H = sc.nextInt();
        map = new int[H][W];
        visited = new int[H][W][K + 1];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 0}); // 시작점
        for (int[][] layer : visited) {
            for (int[] arr : layer) {
                Arrays.fill(arr, Integer.MAX_VALUE);
            }
        }
        visited[0][0][0] = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], k = cur[2];
            if (x == H - 1 && y == W - 1) return visited[x][y][k]; // 도착점 도달

            // 말의 움직임 시도
            if (k < K) {
                for (int i = 0; i < 8; i++) {
                    int nx = x + hx[i];
                    int ny = y + hy[i];
                    if (nx >= 0 && ny >= 0 && nx < H && ny < W && map[nx][ny] == 0 && visited[nx][ny][k + 1] > visited[x][y][k] + 1) {
                        visited[nx][ny][k + 1] = visited[x][y][k] + 1;
                        q.add(new int[]{nx, ny, k + 1});
                    }
                }
            }

            // 상하좌우 움직임 시도
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < H && ny < W && map[nx][ny] == 0 && visited[nx][ny][k] > visited[x][y][k] + 1) {
                    visited[nx][ny][k] = visited[x][y][k] + 1;
                    q.add(new int[]{nx, ny, k});
                }
            }
        }

        return -1; // 도착점에 도달할 수 없는 경우
    }
}
