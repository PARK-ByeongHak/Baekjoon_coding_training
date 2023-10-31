import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reflect = "bdpqiovwxx";

        while (true) {
            String word = scanner.nextLine();

            if (word.equals("#")) {
                break;
            }

            String result = "";

            for (int i = 0; i < word.length(); i++) {
                char alphabet = word.charAt(i);
                if (reflect.indexOf(alphabet) == -1) {
                    result = "INVALID";
                    break;
                } else {
                    if (alphabet == 'b') {
                        result += 'd';
                    } else if (alphabet == 'd') {
                        result += 'b';
                    } else if (alphabet == 'p') {
                        result += 'q';
                    } else if (alphabet == 'q') {
                        result += 'p';
                    } else {
                        result += alphabet;
                    }
                }
            }

            if (!result.equals("INVALID")) {
                for (int j = result.length() - 1; j >= 0; j--) {
                    System.out.print(result.charAt(j));
                }
                System.out.println();
            } else {
                System.out.println(result);
            }
        }
    }
}
