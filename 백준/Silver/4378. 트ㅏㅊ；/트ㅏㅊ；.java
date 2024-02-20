import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] keyBoard = {"`1234567890-=", "QWERTYUIOP[]\\", "ASDFGHJKL;\'", "ZXCVBNM,./"};

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            StringBuilder output = new StringBuilder();

            for (char c : input.toCharArray()) {
                boolean chk = false;
                if (c == ' ') {
                    output.append(c);
                } else {
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < keyBoard[i].length(); j++) {
                            if (keyBoard[i].charAt(j) == c) {
                                output.append(keyBoard[i].charAt(j - 1));
                                chk = true;
                                break;
                            }
                        }
                        if (chk) {
                            break;
                        }
                    }
                }
            }
            System.out.println(output);
        }
    }
}
