import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] dp = new int[N + 1]; // dp[i]는 숫자 i를 1로 만들기 위한 최소 연산 횟수를 저장

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1; // 1을 뺄 경우
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누어 떨어질 경우
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나누어 떨어질 경우
            }
        }
        
        System.out.println(dp[N]);
    }
}
