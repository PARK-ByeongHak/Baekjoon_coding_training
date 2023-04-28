import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters = sc.nextLine();
        char missingLetter = ' ';

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            if (letters.indexOf(letter) == -1) {
                missingLetter = letter;
                break;
            }
        }

        System.out.println(missingLetter);
    }
}
