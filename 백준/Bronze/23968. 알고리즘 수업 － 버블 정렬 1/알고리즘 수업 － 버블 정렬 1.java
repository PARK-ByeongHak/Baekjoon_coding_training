import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] li = new int[n];
        for (int i = 0; i < n; i++) {
            li[i] = scanner.nextInt();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (li[j] > li[j + 1]) {
                    int temp = li[j];
                    li[j] = li[j + 1];
                    li[j + 1] = temp;
                    k--;
                    if (k == 0) {
                        System.out.println(li[j] + " " + li[j + 1]);
                        System.exit(0);
                    }
                }
            }
        }

        System.out.println(-1);
    }
}
