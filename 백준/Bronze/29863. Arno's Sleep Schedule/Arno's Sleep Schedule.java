import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sleepTime = sc.nextInt();
        int alarmTime = sc.nextInt();

        int sleepDuration;

        if (alarmTime > sleepTime) {
            sleepDuration = alarmTime - sleepTime;
        } else {
            sleepDuration = 24 - sleepTime + alarmTime;
        }

        System.out.println(sleepDuration);
    }
}
