import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();// 테스트 케이스 수
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();// 수 입력 받기
            int tot = 0;// 토탈값 초기화
            for (int j = 1; j <= n; j++) {
                tot += j * (j + 1) * (j + 2) / 2;// 반복문을 통해 계산
            }
            System.out.println(tot);// 출력
        }
    }
}