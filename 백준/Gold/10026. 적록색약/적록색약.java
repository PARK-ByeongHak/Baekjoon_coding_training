import java.util.Scanner;

public class Main {
    static int N;
    static char[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            grid[i] = sc.next().toCharArray();
        }

        int normalCount = 0;
        int colorBlindCount = 0;

        // 적록색약이 아닌 사람
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, grid[i][j]);
                    normalCount++;
                }
            }
        }

        visited = new boolean[N][N]; // 방문 배열 초기화

        // 적록색약인 사람
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 'G') {
                    grid[i][j] = 'R'; // 적록색약인 경우 R과 G를 같은 색으로 처리
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, grid[i][j]);
                    colorBlindCount++;
                }
            }
        }

        System.out.println(normalCount + " " + colorBlindCount);
    }

    public static void dfs(int x, int y, char color) {
        if (x < 0 || y < 0 || x >= N || y >= N || visited[x][y] || grid[x][y] != color) {
            return;
        }

        visited[x][y] = true;

        dfs(x + 1, y, color);
        dfs(x - 1, y, color);
        dfs(x, y + 1, color);
        dfs(x, y - 1, color);
    }
}
