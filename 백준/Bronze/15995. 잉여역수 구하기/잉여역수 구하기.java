import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (a * i % m == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
