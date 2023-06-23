import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcaseNum = scanner.nextInt();

        for (int i = 0; i < testcaseNum; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int answer = 0;
            int[][] array = new int[100][100];

            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    array[j][k] = scanner.nextInt();
                }
            }

            for (int k = 0; k < n; k++) {
                int count = 0;

                for (int j = m - 1; j >= 0; j--) {
                    if (array[j][k] == 1) {
                        answer += (m - j) - (++count);
                    }
                }
            }

            System.out.println(answer);
        }

        scanner.close();
    }
}
