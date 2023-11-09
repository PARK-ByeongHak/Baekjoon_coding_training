import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 입력
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            // 정수 n 입력
            int n = sc.nextInt();

            // 1, 2, 3의 합으로 나타내는 방법의 수 계산
            int[] dp = new int[n + 1];
            dp[0] = 1;

            for (int i = 1; i <= n; i++) {
                if (i - 1 >= 0) {
                    dp[i] += dp[i - 1];
                }
                if (i - 2 >= 0) {
                    dp[i] += dp[i - 2];
                }
                if (i - 3 >= 0) {
                    dp[i] += dp[i - 3];
                }
            }

            // 결과 출력
            System.out.println(dp[n]);
        }
    }
}
