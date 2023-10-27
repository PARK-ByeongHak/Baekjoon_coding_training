import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // 입력값을 32비트 부호 없는 정수로 읽음
        long steps = calculateSCSLength(n);
        System.out.println(steps);
    }

    static long calculateSCSLength(long n) {
        long steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n + 1;
            }
            steps++;
        }
        return steps;
    }
}
