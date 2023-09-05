import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int yIdx = 0; // YONSEI에서 현재까지 일치하는 문자의 인덱스
        int kIdx = 0; // KOREA에서 현재까지 일치하는 문자의 인덱스

        for (char c : S.toCharArray()) {
            if (yIdx < 6 && c == "YONSEI".charAt(yIdx)) {
                yIdx++;
            }

            if (kIdx < 5 && c == "KOREA".charAt(kIdx)) {
                kIdx++;
            }
        }

        if (yIdx == 6) {
            System.out.println("YONSEI");
        } else if (kIdx == 5) {
            System.out.println("KOREA");
        }
    }
}
