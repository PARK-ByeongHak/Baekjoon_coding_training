import java.util.*;

class Shark {
    int x, y, size = 2, eatCount = 0, time = 0;

    public Shark(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N;
    static int[][] space;
    static Shark shark;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        space = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                space[i][j] = sc.nextInt();
                if (space[i][j] == 9) {
                    shark = new Shark(i, j);
                    space[i][j] = 0;
                }
            }
        }

        while (true) {
            if (!findFish()) break;
        }

        System.out.println(shark.time);
        sc.close();
    }

    public static boolean findFish() {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        PriorityQueue<int[]> fish = new PriorityQueue<>((o1, o2) -> {
            if (o1[2] == o2[2]) {
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
            return o1[2] - o2[2];
        });

        q.offer(new int[]{shark.x, shark.y, 0});
        visited[shark.x][shark.y] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && space[nx][ny] <= shark.size) {
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny, current[2] + 1});

                    if (space[nx][ny] > 0 && space[nx][ny] < shark.size) {
                        fish.offer(new int[]{nx, ny, current[2] + 1});
                    }
                }
            }
        }

        if (fish.isEmpty()) return false;

        int[] selectedFish = fish.poll();
        space[selectedFish[0]][selectedFish[1]] = 0;
        shark.x = selectedFish[0];
        shark.y = selectedFish[1];
        shark.time += selectedFish[2];
        shark.eatCount++;

        if (shark.eatCount == shark.size) {
            shark.size++;
            shark.eatCount = 0;
        }

        return true;
    }
}
