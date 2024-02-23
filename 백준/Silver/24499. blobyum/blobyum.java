import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] sumList = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            sumList[i] = sumList[i - 1] + A[i - 1];
        }

        int max = 0;

        for (int i = 0; i < N; i++) {
            if (i + K <= N) {
                max = Math.max(max, sumList[i + K] - sumList[i]);
            } else {
                max = Math.max(max, sumList[N] - sumList[i] + sumList[(i + K) % N]);
            }
        }

        System.out.println(max);
    }
}
