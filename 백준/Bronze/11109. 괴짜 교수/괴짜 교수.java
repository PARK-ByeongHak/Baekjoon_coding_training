import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트케이스의 개수

        for (int i = 0; i < T; i++) {
            int d = sc.nextInt(); // 병렬 버전을 개발하는 시간
            int n = sc.nextInt(); // 다음해 동안 프로그램 실행 횟수
            int s = sc.nextInt(); // 직렬 버전의 실행 시간
            int p = sc.nextInt(); // 병렬 버전의 실행 시간

            int parallelizedTime = d + (n * p); // 병렬화된 작업량
            int serialTime = n * s; // 직렬화된 작업량

            if (parallelizedTime < serialTime) {
                System.out.println("parallelize");
            } else if (parallelizedTime > serialTime) {
                System.out.println("do not parallelize");
            } else {
                System.out.println("does not matter");
            }
        }

    }
}