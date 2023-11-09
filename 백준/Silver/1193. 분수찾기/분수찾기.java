import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int row = 1;  // 행 초기값
        int col = 1;  // 열 초기값

        // 행 우선 순회를 통해 X번째 분수의 위치 찾기
        while (x > row) {
            x -= row;
            row++;
        }

        // 행, 열의 합이 짝수일 때
        if (row % 2 == 0) {
            col = x;
        }
        // 행, 열의 합이 홀수일 때
        else {
            col = row - x + 1;
        }

        System.out.println(col + "/" + (row - col + 1));
    }
}