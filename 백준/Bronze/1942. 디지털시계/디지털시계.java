import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int MAX = 3;
    private static final int MAX_SECOND = 60;
    private static final int MAX_MINUTE = 60;
    private static final int MAX_HOUR = 24;

    static class Time {
        int hour, minute, second;

        Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < MAX; i++) {
            String input = br.readLine();

            Time startTime, endTime;
            getTimeStruct(input, startTime = new Time(0, 0, 0), endTime = new Time(0, 0, 0));

            int result = 0;

            while (true) {
                int start = convertTimeStructToInt(startTime);
                int end = convertTimeStructToInt(endTime);

                if (start % 3 == 0) {
                    result++;
                }

                if (isTimeEqual(startTime, endTime)) {
                    break;
                }

                incrementTime(startTime);
            }

            System.out.println(result);
        }
    }

    private static void getTimeStruct(String input, Time startTime, Time endTime) {
        startTime.hour = Integer.parseInt(input.substring(0, 2));
        startTime.minute = Integer.parseInt(input.substring(3, 5));
        startTime.second = Integer.parseInt(input.substring(6, 8));

        endTime.hour = Integer.parseInt(input.substring(9, 11));
        endTime.minute = Integer.parseInt(input.substring(12, 14));
        endTime.second = Integer.parseInt(input.substring(15, 17));
    }

    private static boolean isTimeEqual(Time startTime, Time endTime) {
        return startTime.hour == endTime.hour
                && startTime.minute == endTime.minute
                && startTime.second == endTime.second;
    }

    private static int convertTimeStructToInt(Time time) {
        return time.hour * 10000 + time.minute * 100 + time.second;
    }

    private static void incrementTime(Time time) {
        time.second++;

        if (time.second == MAX_SECOND) {
            time.second = 0;
            time.minute++;
        }

        if (time.minute == MAX_MINUTE) {
            time.minute = 0;
            time.hour++;
        }

        if (time.hour == MAX_HOUR) {
            time.hour = 0;
        }
    }
}
