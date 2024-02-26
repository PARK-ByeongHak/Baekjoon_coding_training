import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int STR = scanner.nextInt();
        int DEX = scanner.nextInt();
        int INT = scanner.nextInt();
        int LUK = scanner.nextInt();
        int N = scanner.nextInt();

        int sum = STR + DEX + INT + LUK;
        int tSum = N * 4;

        if (tSum - sum > 0) {
            System.out.println(tSum - sum);
        } else {
            System.out.println(0);
        }
    }
}
