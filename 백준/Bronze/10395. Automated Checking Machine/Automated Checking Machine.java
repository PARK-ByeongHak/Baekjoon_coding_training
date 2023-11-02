import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        char c = 'Y';

        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            if (a[i] == x) {
                c = 'N';
            }
        }

        System.out.println(c);
    }
}
