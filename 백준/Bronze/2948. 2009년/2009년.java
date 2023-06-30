import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();

        // Calendar 인스턴스 생성
        Calendar calendar = Calendar.getInstance();
        // 날짜 설정
        calendar.set(2009, month - 1, day);
        // 요일 가져오기 (1: 일요일, 2: 월요일, ..., 7: 토요일)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // 요일을 영어로 변환하여 출력
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfWeek[dayOfWeek - 1]);

        sc.close();
    }
}
