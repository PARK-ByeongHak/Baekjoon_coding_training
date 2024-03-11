import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] lists = new int[N];

        for (int i = 0; i < N; i++) {
            lists[i] = scanner.nextInt();
        }

        int X = scanner.nextInt();
        int[] dp = new int[1000001];

        double sum = 0;
        int count = 0;

        for (int d : lists) {
            if (dp[d] == 0) {
                if (gcd(d, X) == 1) {
                    dp[d] = 1;
                    sum += d;
                    count++;
                } else {
                    dp[d] = 2;
                }
            } else if (dp[d] == 1) {
                sum += d;
                count++;
            }
        }

        System.out.println(sum / count);
    }

    // 최대공약수 계산 함수
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
