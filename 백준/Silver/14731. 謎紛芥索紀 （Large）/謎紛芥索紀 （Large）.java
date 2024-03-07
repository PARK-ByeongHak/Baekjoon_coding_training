import java.util.Scanner;

public class Main {
    static final int modulo = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            long C = scanner.nextLong();
            long K = scanner.nextLong();
            long temp;

            if (K >= 1) {
                temp = (((C * K) % modulo) * powerModular(2, K - 1, modulo)) % modulo;
            } else {
                temp = 0;
            }

            sum = (sum + temp) % modulo;
        }

        System.out.println(sum);
    }

    static long powerModular(long x, long y, long M) {
        x %= M;
        long result = 1;

        while (y > 0) {
            if ((y & 1) == 1) {
                result = (result * x) % M;
            }
            x = (x * x) % M;
            y >>= 1;
        }

        return result;
    }
}
