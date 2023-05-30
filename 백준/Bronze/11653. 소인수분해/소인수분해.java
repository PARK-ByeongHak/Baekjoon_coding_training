import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 N 입력 받기
        int N = sc.nextInt();

        // 소인수분해
        int divisor = 2; // 나누는 수로 2부터 시작
        while (N > 1) {
            if (N % divisor == 0) { // divisor가 N의 약수인 경우
                System.out.println(divisor);
                N /= divisor;
            } else {
                divisor++;
            }
        }
    }
}
