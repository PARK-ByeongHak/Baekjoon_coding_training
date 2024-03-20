import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Marble {
    int redRow, redCol, blueRow, blueCol, count;

    public Marble(int redRow, int redCol, int blueRow, int blueCol, int count) {
        this.redRow = redRow;
        this.redCol = redCol;
        this.blueRow = blueRow;
        this.blueCol = blueCol;
        this.count = count;
    }
}

public class Main {
    static int N, M;
    static char[][] board;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new char[N][M];

        int redRow = 0, redCol = 0, blueRow = 0, blueCol = 0;
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'R') {
                    redRow = i;
                    redCol = j;
                } else if (board[i][j] == 'B') {
                    blueRow = i;
                    blueCol = j;
                }
            }
        }

        System.out.println(bfs(redRow, redCol, blueRow, blueCol));
        sc.close();
    }

    static int bfs(int redRow, int redCol, int blueRow, int blueCol) {
        Queue<Marble> queue = new LinkedList<>();
        boolean[][][][] visited = new boolean[N][M][N][M];
        queue.add(new Marble(redRow, redCol, blueRow, blueCol, 0));
        visited[redRow][redCol][blueRow][blueCol] = true;

        while (!queue.isEmpty()) {
            Marble current = queue.poll();
            if (current.count > 10) return -1;
            if (board[current.redRow][current.redCol] == 'O' && board[current.blueRow][current.blueCol] != 'O') {
                return current.count;
            }

            for (int i = 0; i < 4; i++) {
                int nextRedRow = current.redRow, nextRedCol = current.redCol;
                int nextBlueRow = current.blueRow, nextBlueCol = current.blueCol;

                // 빨간 구슬 이동
                while (board[nextRedRow + dx[i]][nextRedCol + dy[i]] != '#' && board[nextRedRow][nextRedCol] != 'O') {
                    nextRedRow += dx[i];
                    nextRedCol += dy[i];
                }

                // 파란 구슬 이동
                while (board[nextBlueRow + dx[i]][nextBlueCol + dy[i]] != '#' && board[nextBlueRow][nextBlueCol] != 'O') {
                    nextBlueRow += dx[i];
                    nextBlueCol += dy[i];
                }

                // 빨간 구슬과 파란 구슬이 겹치는 경우
                if (nextRedRow == nextBlueRow && nextRedCol == nextBlueCol) {
                    if (board[nextRedRow][nextRedCol] != 'O') {
                        int redDistance = Math.abs(nextRedRow - current.redRow) + Math.abs(nextRedCol - current.redCol);
                        int blueDistance = Math.abs(nextBlueRow - current.blueRow) + Math.abs(nextBlueCol - current.blueCol);
                        if (redDistance > blueDistance) {
                            nextRedRow -= dx[i];
                            nextRedCol -= dy[i];
                        } else {
                            nextBlueRow -= dx[i];
                            nextBlueCol -= dy[i];
                        }
                    }
                }

                // 방문하지 않은 상태라면 큐에 추가
                if (!visited[nextRedRow][nextRedCol][nextBlueRow][nextBlueCol]) {
                    visited[nextRedRow][nextRedCol][nextBlueRow][nextBlueCol] = true;
                    queue.add(new Marble(nextRedRow, nextRedCol, nextBlueRow, nextBlueCol, current.count + 1));
                }
            }
        }

        return -1; // 10번 이내에 성공하지 못한 경우
    }
}
