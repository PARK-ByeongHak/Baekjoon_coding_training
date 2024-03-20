import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int[] dp = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            dp[i] = 100001; // 가치가 100,000보다 작거나 같으므로, 최대값보다 큰 수로 초기화
        }
        dp[0] = 0; // 0원을 만드는 데 필요한 동전의 개수는 0개
        
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= k; j++) {
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        
        if (dp[k] == 100001) {
            System.out.println(-1); // 불가능한 경우
        } else {
            System.out.println(dp[k]); // 사용한 동전의 최소 개수 출력
        }
        sc.close();
    }
}
