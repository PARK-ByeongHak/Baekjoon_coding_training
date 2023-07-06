import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int problemCount = 0;

        String command = scanner.nextLine();

        while (!command.equals("고무오리 디버깅 끝")) {
            if (command.equals("문제")) {
                problemCount++;
            } else if (command.equals("고무오리")) {
                if (problemCount == 0) {
                    problemCount += 2;
                } else {
                    problemCount--;
                }
            }

            command = scanner.nextLine();
        }

        if (problemCount == 0) {
            System.out.println("고무오리야 사랑해");
        } else {
            System.out.println("힝구");
        }
    }
}