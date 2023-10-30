import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int ans = 0;
        int cur = x;
        int two = 1;
        int dir = 1;

        while (true) {
            while (true) {
                if (cur == y) {
                    System.out.println(ans);
                    return;
                }
                if (cur == x + dir * two) {
                    break;
                }
                ans++;
                cur += dir;
            }
            dir *= -1;
            two *= 2;
        }
    }
}
