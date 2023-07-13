import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        boolean hasM = false;
        boolean hasO = false;
        boolean hasB = false;
        boolean hasI = false;
        boolean hasS = false;

        for (char c : input.toCharArray()) {
            if (c == 'M') {
                hasM = true;
            } else if (c == 'O') {
                hasO = true;
            } else if (c == 'B') {
                hasB = true;
            } else if (c == 'I') {
                hasI = true;
            } else if (c == 'S') {
                hasS = true;
            }
        }

        if (hasM && hasO && hasB && hasI && hasS) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
