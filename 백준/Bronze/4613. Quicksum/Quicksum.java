import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("#")) {
                break;
            }

            int quicksum = calculateQuicksum(line);
            System.out.println(quicksum);
        }

        scanner.close();
    }

    public static int calculateQuicksum(String line) {
        int quicksum = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == ' ') {
                continue; // Skip spaces
            }

            int position = ch - 'A' + 1; // Convert character to position value
            quicksum += (i + 1) * position;
        }
        return quicksum;
    }
}
