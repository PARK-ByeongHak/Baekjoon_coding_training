import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[][] D = new int[2001][2001];
            int[][] input = new int[2001][2001];
            int[][] mxOut = new int[2001][2001];
            int[][] output = new int[2001][2001];

            for (int i = 1; i <= M; i++) {
                String row = sc.next();
                for (int j = 0; j < N; j++) {
                    char a = row.charAt(j);
                    D[i][j + 1] = a - '0';
                }
            }

            int ans = 0;
            for (int i = 1; i <= N; i++) {
                // 가중치를 계산하는 부분
                for (int j = 1; j <= M; j++) {
                    int maxPrev = 0;

                    // 주변 열을 검사하여 최댓값 찾기
                    for (int k = j - 1; k <= j + 1; k++) {
                        if (k >= 1 && k <= M) {
                            // 조건을 만족하는 (a, b) 선택
                            int a = k;
                            int b = j - (Math.abs(i - a));
                            if (b >= 1 && b < j) {
                                maxPrev = Math.max(maxPrev, mxOut[k][i - 1]);
                            }
                        }
                    }

                    input[j][i] = maxPrev;
                    output[j][i] = input[j][i] + D[j][i];
                    mxOut[j][i] = Math.max(output[j][i], mxOut[j][i]);
                    ans = Math.max(ans, input[j][i]);
                }
            }

            System.out.println(ans);
        } else {
            System.out.println("Invalid input format");
        }

        // Scanner를 닫습니다.
        sc.close();
    }
}
