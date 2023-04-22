import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();// 테스트 케이스 횟수
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();// N값 입력받기
            long k = (long)n * n;// 범위를 벗어날 수 있으므로 long으로 변환
            System.out.println(k);// 출력
        }
    }
}
