import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] x = new long[N];
        long[] y = new long[N];

        // 점들의 좌표 입력 받기
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        sc.close();

        // 신발끈 공식을 사용하여 면적 계산
        long area = 0;
        for (int i = 0; i < N - 1; i++) {
            area += x[i] * y[i + 1] - y[i] * x[i + 1];
        }
        area += x[N - 1] * y[0] - y[N - 1] * x[0]; // 마지막 점과 첫 번째 점을 연결
        area = Math.abs(area); // 절대값을 취함

        System.out.printf("%.1f\n", area / 2.0); // 면적 출력
    }
}
