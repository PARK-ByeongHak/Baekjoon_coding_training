import java.util.Scanner;

public class Main {
    static int[][] forest;
    static int[][] dp;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        forest = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                forest[i][j] = sc.nextInt();
            }
        }

        int maxMove = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxMove = Math.max(maxMove, dfs(i, j));
            }
        }

        System.out.println(maxMove);
        sc.close();
    }

    static int dfs(int x, int y) {
        if (dp[x][y] != 0) {
            return dp[x][y];
        }

        dp[x][y] = 1; // 시작 칸도 이동 칸에 포함되므로 1로 초기화

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (forest[nx][ny] > forest[x][y]) {
                    dp[x][y] = Math.max(dp[x][y], dfs(nx, ny) + 1);
                }
            }
        }

        return dp[x][y];
    }
}
