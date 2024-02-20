import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            for (int i = 0; i < N / 5; i++) {
                System.out.print("++++ ");
            }
            for (int i = 0; i < N % 5; i++) {
                System.out.print('|');
            }
            System.out.println();
        }
    }
}
