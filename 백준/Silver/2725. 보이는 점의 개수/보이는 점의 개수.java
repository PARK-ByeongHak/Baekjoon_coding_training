import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 최대 크기의 배열을 만들고 초기값 설정
        int[] dp = new int[1001];
        dp[1] = 3;

        // dp 배열을 채우는 부분
        for (int i = 2; i <= 1000; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    continue;
                }

                if (gcd(i, j) == 1) {
                    cnt += 2;
                }
            }
            dp[i] = dp[i - 1] + cnt;
        }

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            System.out.println(dp[N]);
        }
    }

    // 최대 공약수를 계산하는 함수
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
