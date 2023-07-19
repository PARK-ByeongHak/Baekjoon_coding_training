import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        for (int i = 1; i <= testCaseCount; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            long sum = (long) (n + m) * (m - n + 1) / 2; // 정수 합 계산식

            System.out.println("Scenario #" + i + ":");
            System.out.println(sum);
            System.out.println();
        }
        scanner.close();
    }
}
