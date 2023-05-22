import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            // 각 테스트 케이스마다 반복
        	sc.nextLine();
            int N = sc.nextInt(); // 우주선 갯수
            double range = sc.nextDouble(); // 가야할 거리
            int cnt = 0;
            for (int i = 0; i < N; i++) {
            	double v = sc.nextDouble();
            	double f = sc.nextDouble();
            	double c = sc.nextDouble();
            	if((range/v)*c<=f) {
            		cnt++;
            	}
            }
            System.out.println(cnt);
        }
    }
}