import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // M과 N 입력 받기
        int M = sc.nextInt();
        int N = sc.nextInt();
        // 소수 찾기
        int sum = 0; // 소수의 합
        int minPrime = -1; // 최솟값
        boolean isPrime; // 소수 여부를 체크하기 위한 변수

        for (int num = M; num <= N; num++) {
            isPrime = true; // 초기값은 true로 설정
            // 소수인지 판별
            if (num <= 1) { // 1 이하의 수는 소수가 아님
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) { // 약수가 존재하면 소수가 아님
                        isPrime = false;
                        break;
                    }
                }
            }
            // 소수인 경우 합과 최솟값 계산
            if (isPrime) {
                if (minPrime == -1) { // 최솟값을 설정하지 않았을 때
                    minPrime = num;
                }
                sum += num;
            }
        }
        // 결과 출력
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }
}
