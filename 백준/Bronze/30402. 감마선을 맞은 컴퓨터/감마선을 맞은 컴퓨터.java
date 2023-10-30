import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            String[] board = scanner.nextLine().split(" ");

            if (contains(board, "w")) {
                System.out.println("chunbae");
                break;
            } else if (contains(board, "b")) {
                System.out.println("nabi");
                break;
            } else if (contains(board, "g")) {
                System.out.println("yeongcheol");
                break;
            }
        }
    }

    public static boolean contains(String[] arr, String target) {
        for (String s : arr) {
            if (s.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
