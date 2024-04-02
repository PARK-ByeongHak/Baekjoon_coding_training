import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n + 1][m + 1];
        int[][] dp = new int[n + 1][m + 1];
        int maxSquare = 0;

        // 배열 입력 받기
        for (int i = 1; i <= n; i++) {
            String row = sc.next();
            for (int j = 1; j <= m; j++) {
                map[i][j] = row.charAt(j - 1) - '0';
            }
        }

        // DP를 이용하여 가장 큰 정사각형 찾기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxSquare = Math.max(maxSquare, dp[i][j]);
                }
            }
        }

        // 가장 큰 정사각형의 넓이 출력
        System.out.println(maxSquare * maxSquare);
        sc.close();
    }
}
