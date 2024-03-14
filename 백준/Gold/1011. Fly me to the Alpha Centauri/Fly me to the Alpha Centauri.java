import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int x = sc.nextInt(); // 현재 위치
            int y = sc.nextInt(); // 목표 위치
            int distance = y - x; // 이동해야 할 거리
            int max = (int) Math.sqrt(distance); // 이동 거리의 제곱근

            if (max == Math.sqrt(distance)) {
                System.out.println(2 * max - 1);
            } else if (distance <= max * max + max) {
                System.out.println(2 * max);
            } else {
                System.out.println(2 * max + 1);
            }
        }
        sc.close();
    }
}
