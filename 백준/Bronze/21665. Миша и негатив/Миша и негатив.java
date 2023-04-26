import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        char[][] original = new char[n][m];
        char[][] negative = new char[n][m];

        // 입력 받은 두 개의 배열을 동시에 저장
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextLine().toCharArray();
        }

        sc.nextLine(); // 빈 줄 읽기

        for (int i = 0; i < n; i++) {
            negative[i] = sc.nextLine().toCharArray();
        }

        int errorCount = 0;

        // 하나의 배열에서 바로 바꾸어줌
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (original[i][j] == 'B' && negative[i][j] == 'B') {
                    errorCount++;
                } else if (original[i][j] == 'W' && negative[i][j] == 'W') {
                    errorCount++;
                }
            }
        }

        System.out.println(errorCount);
    }
}
