import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt(); // 테스트 케이스 개수

        while (P-- > 0) {
            int l = sc.nextInt(); // 그리드 사각형의 길이
            long totalSquares = 0; // 전체 정사각형의 개수

            for (int i = 1; i <= l; i++) {
                // i x i 크기의 정사각형을 추가
                totalSquares += (long) i * i;
            }

            System.out.println(totalSquares);
        }
    }
}
