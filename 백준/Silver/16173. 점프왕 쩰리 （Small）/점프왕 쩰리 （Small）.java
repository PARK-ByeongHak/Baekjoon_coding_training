import java.io.*;
import java.util.*;

public class Main {
    
    static int N;
    static int[][] board;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(dfs(0, 0));
        br.close();
    }
    
    static public String dfs(int x, int y) {
        int count = board[x][y];
        visited[x][y] = true;
        if (count == -1) {
            return "HaruHaru";
        }
        if (x + count < N && !visited[x + count][y] && !dfs(x + count, y).equals("Hing")) {
            return "HaruHaru";
        }
        if (y + count < N && !visited[x][y + count] && !dfs(x, y + count).equals("Hing")) {
            return "HaruHaru";
        }
        return "Hing";
    }
}