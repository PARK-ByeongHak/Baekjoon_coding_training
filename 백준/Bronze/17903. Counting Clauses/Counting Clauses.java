import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // 절의 수
        int n = sc.nextInt(); // 변수의 수
        int[][] arr = new int[m][3]; // 절 배열

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt(); // 절 입력 받기
            }
        }

        // m이 8 이상인지 확인하여 결과 출력
        if (m >= 8) {
            System.out.println("satisfactory");
        } else {
            System.out.println("unsatisfactory");
        }
    }
}
