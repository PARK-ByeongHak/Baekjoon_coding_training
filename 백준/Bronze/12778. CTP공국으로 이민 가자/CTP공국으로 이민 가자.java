import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n-- > 0) {
            int a = scanner.nextInt();
            char b = scanner.next().charAt(0);

            if (b == 'C') {
                for (int i = 0; i < a; i++) {
                    char c = scanner.next().charAt(0);
                    System.out.print((int) (c - 'A' + 1) + " ");
                }
            } else {
                for (int i = 0; i < a; i++) {
                    int c = scanner.nextInt();
                    System.out.print((char) ('A' + c - 1) + " ");
                }
            }
        System.out.println();
        }
    }
}