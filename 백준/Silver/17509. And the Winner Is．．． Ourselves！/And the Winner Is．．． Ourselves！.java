import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[11][2];

        // 입력 받기
        for (int i = 0; i < 11; i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
        }

        // 정렬
        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));

        int pen = 0, pre = 0;

        // 계산
        for (int i = 0; i < 11; i++) {
            pen += pre + a[i][0];
            pre += a[i][0];
        }

        for (int i = 0; i < 11; i++) {
            pen += 20 * a[i][1];
        }

        System.out.println(pen);
    }
}
