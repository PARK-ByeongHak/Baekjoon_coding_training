import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        while (true) {
            word = scanner.next();
            if (word.equals("#"))
                break;

            int idx = 0;
            while (idx < word.length() && !isVowel(word.charAt(idx))) {
                idx++;
            }

            if (idx == 0) {
                System.out.println(word + "ay");
            } else {
                System.out.println(word.substring(idx) + word.substring(0, idx) + "ay");
            }
        }
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
