import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 시작 시각 입력 받기
        String start = sc.nextLine();
        String[] startArr = start.split(" : ");
        int startHr = Integer.parseInt(startArr[0]);
        int startMin = Integer.parseInt(startArr[1]);
        int startSec = Integer.parseInt(startArr[2]);

        // 종료 시각 입력 받기
        String end = sc.nextLine();
        String[] endArr = end.split(" : ");
        int endHr = Integer.parseInt(endArr[0]);
        int endMin = Integer.parseInt(endArr[1]);
        int endSec = Integer.parseInt(endArr[2]);

        // 시작 시각과 종료 시각을 초 단위로 변환하기
        int startTotalSec = startHr * 3600 + startMin * 60 + startSec;
        int endTotalSec = endHr * 3600 + endMin * 60 + endSec;

        // 두 시각 사이의 차이 계산하기
        int diff = endTotalSec - startTotalSec;
        if (diff < 0) {
            diff += 24 * 3600; // 자정을 걸쳐 진행됐다면 24시간을 더해줌
        }

        // 결과 출력하기
        System.out.println(diff);
    }
}
