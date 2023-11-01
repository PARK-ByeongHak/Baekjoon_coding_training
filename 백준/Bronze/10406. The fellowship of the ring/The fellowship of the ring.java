import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        String[] inputValues = scanner.nextLine().split(" ");
        int cnt = 0;

        for (String value : inputValues) {
            int h = Integer.parseInt(value);
            if (w <= h && h <= n) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
