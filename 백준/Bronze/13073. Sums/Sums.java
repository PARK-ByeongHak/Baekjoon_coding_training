import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt();
            long S1 = (long) N * (N + 1) / 2;
            long S2 = N * N;
            long S3 = N * (N + 1);

            System.out.println(S1 + " " + S2 + " " + S3);
        }
    }
}
