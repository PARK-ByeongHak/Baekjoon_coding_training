import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // 상자의 가로 칸의 수
        int N = sc.nextInt(); // 상자의 세로 칸의 수
        int H = sc.nextInt(); // 쌓아올려지는 상자의 수
        int[][][] storage = new int[H][N][M];
        Queue<int[]> queue = new LinkedList<>();
        
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    storage[h][n][m] = sc.nextInt();
                    if (storage[h][n][m] == 1) {
                        queue.add(new int[]{h, n, m});
                    }
                }
            }
        }
        
        System.out.println(bfs(storage, queue, H, N, M));
    }
    
    public static int bfs(int[][][] storage, Queue<int[]> queue, int H, int N, int M) {
        int[] dh = {-1, 1, 0, 0, 0, 0};
        int[] dn = {0, 0, -1, 1, 0, 0};
        int[] dm = {0, 0, 0, 0, -1, 1};
        int days = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] tomato = queue.poll();
                for (int j = 0; j < 6; j++) {
                    int nh = tomato[0] + dh[j];
                    int nn = tomato[1] + dn[j];
                    int nm = tomato[2] + dm[j];
                    
                    if (nh >= 0 && nh < H && nn >= 0 && nn < N && nm >= 0 && nm < M && storage[nh][nn][nm] == 0) {
                        storage[nh][nn][nm] = 1;
                        queue.add(new int[]{nh, nn, nm});
                    }
                }
            }
            days++;
        }
        
        for (int[][] layer : storage) {
            for (int[] row : layer) {
                for (int tomato : row) {
                    if (tomato == 0) {
                        return -1;
                    }
                }
            }
        }
        
        return days - 1; // 첫 날은 제외해야 하므로 1을 뺌
    }
}
