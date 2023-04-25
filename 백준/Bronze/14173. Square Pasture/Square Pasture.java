import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 사각형의 좌표 입력받기
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // 두 번째 사각형의 좌표 입력받기
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        // 두 사각형이 차지하는 x축, y축 길이 구하기
        int x = Math.max(x2, a2) - Math.min(x1, a1);
        int y = Math.max(y2, b2) - Math.min(y1, b1);

        // 두 길이 중 큰 값으로 정사각형 한 변의 길이 구하기
        int side = Math.max(x, y);

        // 정사각형 면적 출력
        System.out.println(side * side);
    }
}