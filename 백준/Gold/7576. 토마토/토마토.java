import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] storage = new int[N][M];
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                storage[i][j] = sc.nextInt();
                // 익은 토마토는 큐에 추가
                if (storage[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        
        System.out.println(minDaysToRipeTomatoes(N, M, storage, queue));
    }
    
    public static int minDaysToRipeTomatoes(int N, int M, int[][] storage, Queue<int[]> queue) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int days = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] tomato = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = tomato[0] + dx[j];
                    int ny = tomato[1] + dy[j];
                    
                    if (nx >= 0 && ny >= 0 && nx < N && ny < M && storage[nx][ny] == 0) {
                        storage[nx][ny] = 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
            if (!queue.isEmpty()) {
                days++;
            }
        }
        
        // 모든 토마토가 익었는지 확인
        for (int[] row : storage) {
            for (int tomato : row) {
                if (tomato == 0) {
                    return -1;
                }
            }
        }
        
        return days;
    }
}
