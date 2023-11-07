import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        scanner.close();

        if (h == 0) {
            System.out.println(1);
        } else if (h == 1) {
            System.out.println(0);
        } else {
            if (h % 2 == 0) {
                for (int i = 0; i < h / 2; i++) {
                    System.out.print(8);
                }
                System.out.println();
            } else {
                System.out.print(4);
                for (int i = 0; i < (h - 1) / 2; i++) {
                    System.out.print(8);
                }
                System.out.println();
            }
        }
    }
}
