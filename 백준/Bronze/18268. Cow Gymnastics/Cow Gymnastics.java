import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[][] ranking = new int[11][21];

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                int r = sc.nextInt();
                ranking[i][r] = j;
            }
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                boolean ok = true;
                for (int k = 0; k < K; k++) {
                    if (ranking[k][i] > ranking[k][j]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) ans++;
            }
        }

        System.out.println(ans);
    }
}
