import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
            X[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int Wi = A[i] * (X[i] - 1) + B[i];
            System.out.println(Wi);
        }
    }
}
