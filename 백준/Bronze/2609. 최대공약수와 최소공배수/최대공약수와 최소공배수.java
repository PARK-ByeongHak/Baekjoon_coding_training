import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 개의 자연수 입력 받기
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 최대 공약수 계산
        int gcd = calculateGCD(num1, num2);

        // 최소 공배수 계산
        int lcm = calculateLCM(num1, num2, gcd);

        // 결과 출력
        System.out.println(gcd);
        System.out.println(lcm);
    }

    // 최대 공약수를 계산하는 함수
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // 최소 공배수를 계산하는 함수
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
