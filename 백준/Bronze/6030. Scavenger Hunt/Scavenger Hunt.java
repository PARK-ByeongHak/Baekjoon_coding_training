import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int Q = scanner.nextInt();

        for (int i = 1; i <= P; i++) {
            if (P % i == 0) {
                for (int j = 1; j <= Q; j++) {
                    if (Q % j == 0) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}
