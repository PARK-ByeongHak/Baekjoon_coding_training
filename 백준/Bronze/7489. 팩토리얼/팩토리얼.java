import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int ans = 1;

            for (int i = 1; i <= n; i++) {
                ans *= i;
                ans %= 100000;
                while (ans % 10 == 0)
                    ans /= 10;
            }

            System.out.println(ans % 10);
        }
    }
}
