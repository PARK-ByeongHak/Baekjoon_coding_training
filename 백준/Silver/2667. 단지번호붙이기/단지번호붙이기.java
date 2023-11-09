import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int dx[] = {0, 0, 1, -1};
    private static int dy[] = {1, -1, 0, 0};
    private static int[] aparts = new int[25 * 25];
    private static int n;
    private static int apartNum = 0; // 아파트 단지 번호의 수
    private static boolean[][] visited = new boolean[25][25]; // 방문 여부
    private static int[][] map = new int[25][25]; // 지도

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        // 전체 사각형 입력 받기
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 집이 있고, 방문하지 않은 경우
                if (map[i][j] == 1 && !visited[i][j]) {
                    apartNum++;
                    dfs(i, j);
                }
            }
        }

        // 아파트 단지 수 출력
        System.out.println(apartNum);

        // 각 단지내 집의 수를 오름차순으로 정렬하여 출력
        Arrays.sort(aparts);
        for (int i = 0; i < aparts.length; i++) {
            if (aparts[i] == 0) {
            } else {
                System.out.println(aparts[i]);
            }
        }
    }
    // 깊이 우선 탐색을 통해 아파트 단지의 크기를 계산
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        aparts[apartNum]++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            // 지도 범위 내에 있고, 아직 방문하지 않았으며, 집이 있는 경우
            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
