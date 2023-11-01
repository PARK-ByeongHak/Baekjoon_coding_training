import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();

            if (str.contains("01") || str.contains("OI")) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
