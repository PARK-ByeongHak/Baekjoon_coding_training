import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1000KWH 이하의 요금과 추가 사용량에 대한 요금을 입력받음
        int rate1 = sc.nextInt(); // 1000KWH 이하의 요금
        int rate2 = sc.nextInt(); // 추가 사용량에 대한 요금
        sc.nextLine(); // 버퍼 지우기

        // 고객 수를 입력받음
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 고객별 전기 사용량을 입력받아 요금을 계산하고 출력
        for (int i = 0; i < n; i++) {
            int usage = sc.nextInt(); // 전기 사용량
            sc.nextLine(); // 버퍼 지우기

            int bill = 0; // 요금 초기화

            if (usage <= 1000) { // 1000KWH 이하인 경우
                bill = usage * rate1;
            } else { // 1000KWH 이상인 경우
                bill = 1000 * rate1 + (usage - 1000) * rate2;
            }

            System.out.println(usage + " " + bill);
        }
    }
}
