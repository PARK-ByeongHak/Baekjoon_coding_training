import java.util.Scanner;

public class Main {
    static int R, C;
    static char[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int maxCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        board = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String line = sc.next();
            for (int j = 0; j < C; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        // Use a boolean array to track which alphabets have been visited
        boolean[] alphaVisited = new boolean[26];
        // Start the search from the top-left corner of the board
        dfs(0, 0, 0, alphaVisited);

        System.out.println(maxCount);
        sc.close();
    }

    private static void dfs(int x, int y, int count, boolean[] alphaVisited) {
        // Convert the character to an index (0-25)
        int index = board[x][y] - 'A';

        // If the alphabet has already been visited, return
        if (alphaVisited[index]) return;

        // Mark the current alphabet as visited
        alphaVisited[index] = true;
        visited[x][y] = true;
        maxCount = Math.max(maxCount, count + 1);

        // Explore the four possible directions
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // Check boundaries and whether the cell has been visited
            if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny]) {
                dfs(nx, ny, count + 1, alphaVisited);
            }
        }

        // Backtrack: unmark the current alphabet and cell as visited
        alphaVisited[index] = false;
        visited[x][y] = false;
    }
}
