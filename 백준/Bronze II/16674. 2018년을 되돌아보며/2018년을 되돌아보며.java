import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX = 10;
        int[] visited = new int[MAX];

        String number = scanner.next();

        for (int i = 0; i < number.length(); i++) {
            visited[number.charAt(i) - '0']++;
        }

        boolean flag = true;

        for (int i = 0; i < MAX; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 8) {
                continue;
            }

            if (visited[i] != 0) {
                flag = false;
                break;
            }
        }

        // 관련 없는 수
        if (!flag) {
            System.out.println(0);
            return;
        }

        // 관련 있는 수이나 밀접한 수가 아님
        if (visited[0] == 0 || visited[1] == 0 || visited[2] == 0 || visited[8] == 0) {
            System.out.println(1);
            return;
        }

        int sum = visited[0];

        // 밀접한 수이지만 묶여있는 수가 아님
        if (visited[1] != sum || visited[2] != sum || visited[8] != sum) {
            System.out.println(2);
            return;
        }

        System.out.println(8);
    }
}
