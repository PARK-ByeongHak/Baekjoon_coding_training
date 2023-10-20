import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;

        for (int i = 0; i <= input.length() - 4; i++) {
            if (input.substring(i, i + 4).equals("DKSH")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
