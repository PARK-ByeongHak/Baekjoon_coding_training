import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] ans;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void bfs(int x, int y, int c) {
        boolean[][] visit = new boolean[N][M];
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(x, y, c));

        while (!q.isEmpty()) {
            Tuple p = q.poll();
            x = p.x;
            y = p.y;
            c = p.c;

            if (c == 0) {
                ans[x][y]++;
                continue;
            }

            for (int d = 0, ix, iy; d < 4; d++) {
                ix = x + dx[d];
                iy = y + dy[d];
                if (0 <= ix && ix < N && 0 <= iy && iy < M && !visit[ix][iy]) {
                    visit[ix][iy] = true;
                    q.add(new Tuple(ix, iy, c - 1));
                }
            }
        }
    }

    static class Tuple {
        int x, y, c;

        public Tuple(int x, int y, int c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        ans = new int[N][M];

        for (int n = 0, v; n < N; n++) {
            v = scanner.nextInt();
            bfs(n, 0, v);
        }

        for (int m = 1, v; m < M; m++) {
            v = scanner.nextInt();
            bfs(N - 1, m, v);
        }

        int x = 0, y = 0, v = 0;
        for (int n = 0, m; n < N; n++) {
            for (m = 0; m < M; m++) {
                if (ans[n][m] > v) {
                    v = ans[n][m];
                    x = n + 1;
                    y = m + 1;
                }
            }
        }

        System.out.println(x + " " + y);
    }
}
