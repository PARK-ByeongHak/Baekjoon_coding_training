import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int day, month, year;
            day = scanner.nextInt();
            month = scanner.nextInt();
            year = scanner.nextInt();

            if (day == 0 && month == 0 && year == 0) {
                break;
            }

            int liveDays = calculateLiveDay(year, month, day);
            System.out.println(liveDays);
        }
    }

    public static int calculateLiveDay(int year, int month, int day) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String inputDateString = year + "-" + month + "-" + day;

        try {
            Date inputDate = dateFormat.parse(inputDateString);
            Date stdDate = dateFormat.parse(year + "-01-01");

            long dateTimeDiff = inputDate.getTime() - stdDate.getTime();
            int daysDiff = (int) (dateTimeDiff / (1000 * 60 * 60 * 24));

            return daysDiff + 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // 오류 발생 시 -1 반환
        }
    }
}
