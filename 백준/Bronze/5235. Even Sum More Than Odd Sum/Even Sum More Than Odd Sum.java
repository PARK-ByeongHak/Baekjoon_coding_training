import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int k = scanner.nextInt();
            int evenSum = 0;
            int oddSum = 0;

            for (int i = 0; i < k; i++) {
                int num = scanner.nextInt();

                if (num % 2 == 1) {
                    oddSum += num;
                } else {
                    evenSum += num;
                }
            }

            if (evenSum > oddSum) {
                System.out.println("EVEN");
            } else if (evenSum == oddSum) {
                System.out.println("TIE");
            } else {
                System.out.println("ODD");
            }
        }
    }
}
