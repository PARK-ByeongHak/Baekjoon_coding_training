import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        int evenCount = 0;
        for (int i = 0; i < n; ++i) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0)
                evenCount++;
        }

        if (evenCount > n / 2)
            System.out.println("Happy");
        else
            System.out.println("Sad");
    }
}
