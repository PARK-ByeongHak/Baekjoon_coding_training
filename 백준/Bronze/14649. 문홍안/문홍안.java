import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 100 + 1;
        int P, N;
        int[] stone = new int[MAX]; // 0: blue, 1: red, 2: green

        P = sc.nextInt();
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int pos = sc.nextInt();
            char direction = sc.next().charAt(0);

            // pos 기준 왼쪽 다 밟음
            if (direction == 'L') {
                for (int j = 1; j < pos; j++) {
                    stone[j] = (stone[j] + 1) % 3;
                }
            }
            // pos 기준 오른쪽 다 밟음
            else {
                for (int j = pos + 1; j < MAX; j++) {
                    stone[j] = (stone[j] + 1) % 3;
                }
            }
        }

        double blue = 0, red = 0, green = 0;

        for (int i = 1; i < MAX; i++) {
            switch (stone[i]) {
                case 0:
                    blue++;
                    break;
                case 1:
                    red++;
                    break;
                case 2:
                    green++;
                    break;
            }
        }

        blue /= 100;
        red /= 100;
        green /= 100;

        System.out.printf("%.2f\n%.2f\n%.2f\n", (double) (P * blue), (double) (P * red), (double) (P * green));
    }
}
