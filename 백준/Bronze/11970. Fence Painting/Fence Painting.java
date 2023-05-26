import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // 겹치는 부분 계산
        int overlap = Math.min(b, d) - Math.max(a, c);
        overlap = Math.max(overlap, 0);  // 겹치는 부분이 음수일 경우 0으로 설정

        // 총 길이 계산
        int totalLength = (b - a) + (d - c) - overlap;

        // 결과 출력
        System.out.println(totalLength);

        scanner.close();
    }
}
