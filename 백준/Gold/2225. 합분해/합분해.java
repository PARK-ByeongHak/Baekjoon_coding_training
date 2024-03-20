import java.util.*;

public class Main {
    private static final int MOD = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] dp = new int[K+1][N+1];

        // 초기값 설정
        for (int i = 0; i <= K; i++) {
            dp[i][0] = 1;
        }

        // 동적 프로그래밍을 이용한 계산
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % MOD;
            }
        }

        // 결과 출력
        System.out.println(dp[K][N]);
        sc.close();
    }
}
