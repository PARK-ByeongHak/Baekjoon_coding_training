import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] li = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int r = scanner.nextInt();
                int g = scanner.nextInt();
                int b = scanner.nextInt();
                li[i][j] = 2126 * r + 7152 * g + 722 * b;
            }
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (li[i][j] < 510000)
                    System.out.print('#');
                else if (li[i][j] < 1020000)
                    System.out.print('o');
                else if (li[i][j] < 1530000)
                    System.out.print('+');
                else if (li[i][j] < 2040000)
                    System.out.print('-');
                else
                    System.out.print('.');
            }
            System.out.println();
        }
    }
}
