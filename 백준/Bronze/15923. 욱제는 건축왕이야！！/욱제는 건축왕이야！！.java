import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int ans = 0;

        int sx, sy, x, y, nx, ny;
        sx = scanner.nextInt();
        sy = scanner.nextInt();
        x = sx;
        y = sy;

        for (int i = 0; i < n - 1; i++) {
            nx = scanner.nextInt();
            ny = scanner.nextInt();
            ans += Math.abs(nx + ny - x - y);
            x = nx;
            y = ny;
        }

        ans += Math.abs(x + y - sx - sy);
        System.out.println(ans);
    }
}
