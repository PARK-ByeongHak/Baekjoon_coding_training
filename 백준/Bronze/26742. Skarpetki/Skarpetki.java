import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int whiteSocks = 0;
        int blackSocks = 0;
        int pairs = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'B') {
                blackSocks++;
                if (blackSocks == 2) {
                    pairs++;
                    blackSocks=0;
                }
            } else {
                whiteSocks++;
                if (whiteSocks == 2) {
                    pairs++;
                    whiteSocks=0;
                }
            }
        }
        System.out.println(pairs);
    }
}