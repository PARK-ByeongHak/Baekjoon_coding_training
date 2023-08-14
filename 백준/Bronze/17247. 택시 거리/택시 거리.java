import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 문자열의 높이
        int M = scanner.nextInt(); // 문자열의 가로
        
        int[][] grid = new int[N][M];
        
        // 도로망 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        // 두 개의 1 사이의 택시 거리 계산
        int taxiDistance = calculateTaxiDistance(grid, N, M);
        
        // 결과 출력
        System.out.println(taxiDistance);
        
        scanner.close();
    }
    
    // 두 개의 1 사이의 택시 거리를 계산하는 함수
    private static int calculateTaxiDistance(int[][] grid, int N, int M) {
        int x1 = -1, y1 = -1; // 첫 번째 1의 좌표
        int x2 = -1, y2 = -1; // 두 번째 1의 좌표
        
        // 두 개의 1의 좌표 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 1) {
                    if (x1 == -1) {
                        x1 = i;
                        y1 = j;
                    } else {
                        x2 = i;
                        y2 = j;
                    }
                }
            }
        }
        
        // 택시 거리 계산
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }
}
