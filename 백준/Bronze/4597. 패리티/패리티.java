import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.next();
            if (s.equals("#")) {
                break;
            }
            int count = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '1') {
                    count++;
                }
            }
            char lastChar = s.charAt(s.length() - 1);
            if (lastChar == 'e') {
                if (count % 2 == 0) {
                    s = s.substring(0, s.length() - 1) + '0';
                } else {
                    s = s.substring(0, s.length() - 1) + '1';
                }
            } else {
                if (count % 2 == 0) {
                    s = s.substring(0, s.length() - 1) + '1';
                } else {
                    s = s.substring(0, s.length() - 1) + '0';
                }
            }
            System.out.println(s);
        }
    }
}