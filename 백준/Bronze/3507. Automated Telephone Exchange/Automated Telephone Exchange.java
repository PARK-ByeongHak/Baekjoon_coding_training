import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 198) {
            System.out.println(0);
        } else {
            System.out.println(99 - (n - 99) + 1);
        }
    }
}
