import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 86400;
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int cur = 3600 * h + 60 * m + s;
        int tc = scanner.nextInt();

        for (int i = 0; i < tc; i++) {
            int x = scanner.nextInt();
            if (x == 3)
                System.out.println(cur / 3600 + " " + (cur / 60) % 60 + " " + cur % 60);
            else if (x == 1) {
                int y = scanner.nextInt();
                cur = (cur + y) % day;
            } else {
                int y = scanner.nextInt();
                cur = (cur - y) % day;
                while (cur < 0) {
                    cur += day;
                }
            }
        }

        scanner.close();
    }
}
