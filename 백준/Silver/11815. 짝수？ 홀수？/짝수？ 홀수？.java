import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < n; i++) {
            long x = scanner.nextLong(); // 약수 개수를 판별할 수

            // 약수의 개수가 홀수인지 짝수인지 판별
            if (isOddDivisorCount(x)) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }

    // 약수의 개수가 홀수인지 판별하는 메서드
    private static boolean isOddDivisorCount(long x) {
        // 약수의 개수가 홀수인 경우, 해당 수는 정수의 제곱근을 가지고 있습니다.
        long sqrtX = (long) Math.sqrt(x);
        return sqrtX * sqrtX == x;
    }
}
