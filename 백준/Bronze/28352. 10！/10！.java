import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // N!을 계산합니다.
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        
        // N!을 주 단위로 변환하여 출력합니다.
        long secondsInWeek = 7 * 24 * 60 * 60;
        long weeks = factorial / secondsInWeek;
        
        System.out.println(weeks);
    }
}
