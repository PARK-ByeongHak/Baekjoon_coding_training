import java.util.Scanner;

public class Main {
    static int T, N, M, K, D;

    static int KOIBaseballSeason() {
        int S = N * M;
        int B = 1, A = K;

        long num = S * K * (M - 1) / 2;
        num += S * (S - M) / 2;

        int ans = (int) (D / num);
        if (ans == 0) return -1;
        return ans * (int) num;
    }

    static void input() {
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            N = scanner.nextInt();
            M = scanner.nextInt();
            K = scanner.nextInt();
            D = scanner.nextInt();
            System.out.println(KOIBaseballSeason());
        }
    }

    public static void main(String[] args) {
        input();
    }
}
