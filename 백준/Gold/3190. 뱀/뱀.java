import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 보드의 크기
        int K = sc.nextInt(); // 사과의 개수
        boolean[][] apples = new boolean[N + 1][N + 1]; // 사과의 위치

        for (int i = 0; i < K; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            apples[row][col] = true; // 사과 위치 저장
        }

        int L = sc.nextInt(); // 뱀의 방향 변환 횟수
        int[] times = new int[L];
        char[] directions = new char[L];

        for (int i = 0; i < L; i++) {
            times[i] = sc.nextInt();
            directions[i] = sc.next().charAt(0);
        }

        System.out.println(simulateGame(N, apples, times, directions));
        sc.close();
    }

    public static int simulateGame(int N, boolean[][] apples, int[] times, char[] directions) {
        int time = 0, timeIndex = 0;
        int[][] moves = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}}; // 오른쪽, 위, 왼쪽, 아래
        int dir = 0; // 초기 방향: 오른쪽
        LinkedList<int[]> snake = new LinkedList<>();
        snake.add(new int[]{1, 1}); // 뱀의 초기 위치

        while (true) {
            time++;
            int[] head = snake.peekFirst();
            int[] nextMove = moves[dir];
            int nextRow = head[0] + nextMove[0];
            int nextCol = head[1] + nextMove[1];

            // 벽이나 자기 자신과 부딪히는 경우 게임 종료
            if (nextRow <= 0 || nextCol <= 0 || nextRow > N || nextCol > N || contains(snake, nextRow, nextCol)) {
                break;
            }

            // 사과가 있는 경우
            if (apples[nextRow][nextCol]) {
                apples[nextRow][nextCol] = false;
            } else { // 사과가 없는 경우
                snake.removeLast();
            }

            snake.addFirst(new int[]{nextRow, nextCol});

            // 방향 전환
            if (timeIndex < times.length && time == times[timeIndex]) {
                dir = turn(dir, directions[timeIndex]);
                timeIndex++;
            }
        }

        return time;
    }

    public static boolean contains(LinkedList<int[]> snake, int row, int col) {
        for (int[] s : snake) {
            if (s[0] == row && s[1] == col) {
                return true;
            }
        }
        return false;
    }

    public static int turn(int dir, char c) {
        if (c == 'L') {
            dir = (dir + 1) % 4;
        } else if (c == 'D') {
            dir = (dir + 3) % 4;
        }
        return dir;
    }
}
