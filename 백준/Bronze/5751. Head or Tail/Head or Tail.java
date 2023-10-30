import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }
            
            int[] li = new int[N];
            int j = 0;
            int m = 0;

            for (int i = 0; i < N; i++) {
                li[i] = scanner.nextInt();
                if (li[i] == 1) {
                    j++;
                } else {
                    m++;
                }
            }

            System.out.println("Mary won " + m + " times and John won " + j + " times");
        }
    }
}
