import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        String sequence = scanner.nextLine();

        for (int i = 0; i < M; i++) {
            String postIt = scanner.nextLine();
            boolean result = checkPassword(sequence, postIt);
            System.out.println(result);
        }
    }

    public static boolean checkPassword(String sequence, String postIt) {
        int idx = 0;
        for (char c : postIt.toCharArray()) {
            if (c == sequence.charAt(idx)) {
                idx++;
                if (idx == sequence.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
