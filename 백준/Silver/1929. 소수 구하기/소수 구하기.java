import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int M = sc.nextInt();
        int N = sc.nextInt();

        // 소수 출력 함수 호출
        printPrimes(M, N);
    }

    // 소수 판별 함수
    private static boolean isPrime(int num) {
        // 소수는 2보다 작은 경우가 없으므로 2 미만인 경우는 false 반환
        if (num < 2) {
            return false;
        }

        // 2부터 제곱근까지의 수로 나누어 떨어지는지 확인
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // 나누어 떨어지면 소수가 아님
                return false;
            }
        }

        // 나누어 떨어지지 않는 경우 소수
        return true;
    }

    // M 이상 N 이하의 소수 출력 함수
    private static void printPrimes(int M, int N) {
        // M부터 N까지의 수 중 소수인 경우 출력
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
