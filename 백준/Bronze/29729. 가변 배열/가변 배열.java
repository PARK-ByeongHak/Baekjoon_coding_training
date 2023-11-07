import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S0 = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int maxSize = S0; // 초기 최대 크기
        int currentSize = 0; // 현재 크기

        for (int i = 0; i < N + M; i++) {
            int command = scanner.nextInt();
            if (command == 1) {
                // 배열에 원소를 저장하는 명령
                currentSize++;
                if (currentSize > maxSize) {
                    maxSize *= 2;
                }
            } else {
                // 배열의 끝에서 원소를 삭제하는 명령
                if (currentSize > 0) {
                    currentSize--;
                }
            }
        }

        System.out.println(maxSize);
        scanner.close();
    }
}
