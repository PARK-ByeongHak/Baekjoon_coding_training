import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 빵집의 수
        int n = sc.nextInt();
        // 기본값을 최대치로 준 최소 거리값
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // 빵이 가게에 도착하는 시간과 내가 가게에 도착하는 시간 계산
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 내가 빵 보다 늦으면 구매 불가
            if (a > b) continue;
            // 내가 빵 보다 빠르면 걸린 시간 비교하여 변수의 값 갱신
            min = Math.min(min, b);
        }
        // min 이 여전히 최초의 값과 같을 경우 -1, 아닐 경우 min 출력
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}
