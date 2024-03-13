import java.util.*;

public class Main {
    static int N, M;
    static int[][] lab;
    static List<int[]> viruses = new ArrayList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int maxSafeArea = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        lab = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                lab[i][j] = sc.nextInt();
                if (lab[i][j] == 2) {
                    viruses.add(new int[]{i, j});
                }
            }
        }

        buildWall(0);
        System.out.println(maxSafeArea);
    }

    public static void buildWall(int count) {
        if (count == 3) {
            maxSafeArea = Math.max(maxSafeArea, simulate());
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (lab[i][j] == 0) {
                    lab[i][j] = 1;
                    buildWall(count + 1);
                    lab[i][j] = 0;
                }
            }
        }
    }

    public static int simulate() {
        int[][] tempLab = new int[N][M];
        for (int i = 0; i < N; i++) {
            System.arraycopy(lab[i], 0, tempLab[i], 0, M);
        }

        Queue<int[]> queue = new LinkedList<>(viruses);

        while (!queue.isEmpty()) {
            int[] virus = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = virus[0] + dx[i];
                int ny = virus[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && tempLab[nx][ny] == 0) {
                    tempLab[nx][ny] = 2;
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        return countSafeArea(tempLab);
    }

    public static int countSafeArea(int[][] tempLab) {
        int safeArea = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tempLab[i][j] == 0) {
                    safeArea++;
                }
            }
        }
        return safeArea;
    }
}
