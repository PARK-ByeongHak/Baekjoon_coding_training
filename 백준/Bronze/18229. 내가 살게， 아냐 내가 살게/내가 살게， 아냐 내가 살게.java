import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[][] len = new int[N][M];
        int[] check = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                len[i][j] = sc.nextInt();
            }
        }

        int turn = 0;
        while (true) {
            for (int i = 0; i < N; i++) {
                check[i] += len[i][turn];
                if (check[i] >= K) {
                    System.out.println((i + 1) + " " + (turn + 1));
                    System.exit(0);
                }
            }
            ++turn;
        }
    }
}
