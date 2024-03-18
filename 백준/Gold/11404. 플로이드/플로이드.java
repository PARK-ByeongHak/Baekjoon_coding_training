import java.util.Scanner;

public class Main {
    final static int INF = 100000 * 100 + 1; // 최대 비용보다 큰 값으로 초기화

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 도시의 개수
        int m = sc.nextInt(); // 버스의 개수
        int[][] dp = new int[n + 1][n + 1];

        // dp 배열을 무한대로 초기화
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                dp[i][j] = INF;
            }
        }

        // 버스 정보 입력 받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            dp[a][b] = Math.min(dp[a][b], c); // 노선이 여러 개일 수 있으므로 최소 비용만 저장
        }

        // Floyd-Warshall 알고리즘 수행
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
                }
            }
        }

        // 결과 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (dp[i][j] == INF) dp[i][j] = 0; // 갈 수 없는 경우 0으로 출력
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
