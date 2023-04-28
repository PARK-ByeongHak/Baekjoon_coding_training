import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double distance = Math.abs(x1 - x2); // 두 값의 절대 거리 계산
            System.out.printf("%.1f\n", distance); // 반올림하여 소수점 첫째 자리까지 출력
        }
        sc.close();
    }
}
