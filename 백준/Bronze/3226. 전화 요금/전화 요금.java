import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int totalCost = 0;
        scanner.nextLine(); // Consume newline character after N

        for (int i = 0; i < N; i++) {
            String callInfo = scanner.nextLine();
            String[] parts = callInfo.split(" ");
            String[] time = parts[0].split(":");
            int hour = Integer.parseInt(time[0]);
            int minute = Integer.parseInt(time[1]);
            int duration = Integer.parseInt(parts[1]);

            int cost = calculateCost(hour, minute, duration);
            totalCost += cost;
        }

        System.out.println(totalCost);
    }

    public static int calculateCost(int hour, int minute, int duration) {
        int cost = 0;

        for (int i = 0; i < duration; i++) {
            if (hour >= 7 && hour < 19) {
                cost += 10; // 7:00 - 19:00
            } else {
                cost += 5;  // 19:00 - 7:00
            }

            minute++;

            if (minute == 60) {
                hour++;
                minute = 0;
            }

            if (hour == 24) {
                hour = 0;
            }
        }

        return cost;
    }
}
