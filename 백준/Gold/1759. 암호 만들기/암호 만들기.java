import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static char[] chars;
    static boolean[] visited;
    static int L, C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();
        chars = new char[C];
        visited = new boolean[C];

        for (int i = 0; i < C; i++) {
            chars[i] = sc.next().charAt(0);
        }
        Arrays.sort(chars);

        generatePassword(0, 0, 0, 0, "");
        sc.close();
    }

    public static void generatePassword(int start, int length, int vowels, int consonants, String password) {
        if (length == L) {
            if (vowels >= 1 && consonants >= 2) {
                System.out.println(password);
            }
            return;
        }

        // Recursive case: try to add each character to the password
        for (int i = start; i < C; i++) {
            if (!visited[i]) {
                visited[i] = true;
                // Check if the character is a vowel or a consonant and update counts
                char ch = chars[i];
                if (isVowel(ch)) {
                    generatePassword(i + 1, length + 1, vowels + 1, consonants, password + ch);
                } else {
                    generatePassword(i + 1, length + 1, vowels, consonants + 1, password + ch);
                }
                visited[i] = false;
            }
        }
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
