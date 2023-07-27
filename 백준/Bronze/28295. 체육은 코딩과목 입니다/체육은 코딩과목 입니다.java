import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] direction = {"N", "E", "S", "W"};
        String result = "N";
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int command = scanner.nextInt();
            if (command == 1) {
                result = direction[(getIndex(result) + 1) % 4];
            } else if (command == 2) {
                result = direction[(getIndex(result) + 2) % 4];
            } else if (command == 3) {
                result = direction[(getIndex(result) + 3) % 4];
            }
        }

        System.out.println(result);
    }

    private static int getIndex(String direction) {
        String[] directions = {"N", "E", "S", "W"};
        for (int i = 0; i < directions.length; i++) {
            if (directions[i].equals(direction)) {
                return i;
            }
        }
        return -1; // Shouldn't happen in this case, assuming valid input.
    }
}
