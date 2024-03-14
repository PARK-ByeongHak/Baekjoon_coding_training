import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int x, y, distance, breakWall;

    public Node(int x, int y, int distance, int breakWall) {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.breakWall = breakWall;
    }
}

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M][2]; // [x][y][0] is not broken, [x][y][1] is broken

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, 1, 0));
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.x == N - 1 && current.y == M - 1) {
                return current.distance;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                if (map[nx][ny] == 0 && !visited[nx][ny][current.breakWall]) {
                    visited[nx][ny][current.breakWall] = true;
                    queue.add(new Node(nx, ny, current.distance + 1, current.breakWall));
                } else if (map[nx][ny] == 1 && current.breakWall == 0) {
                    visited[nx][ny][1] = true;
                    queue.add(new Node(nx, ny, current.distance + 1, 1));
                }
            }
        }

        return -1;
    }
}
