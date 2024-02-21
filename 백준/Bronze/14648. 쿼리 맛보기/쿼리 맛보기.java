import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long q = scanner.nextLong();
        long[] arr = new long[1004];

        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextLong();
        }

        for (int i = 0; i < q; i++) {
            int box = scanner.nextInt();
            long s1 = 0;
            long s2 = 0;

            if (box == 1) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                for (int j = a; j <= b; j++) {
                    s1 += arr[j];
                }
                System.out.println(s1);
                long temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }

            if (box == 2) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                for (int j = a; j <= b; j++) {
                    s1 += arr[j];
                }
                for (int j = c; j <= d; j++) {
                    s2 += arr[j];
                }
                System.out.println(s1 - s2);
            }
        }
    }
}
