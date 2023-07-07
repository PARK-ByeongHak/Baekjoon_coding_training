import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cheerPhraseDict = new HashMap<>();
        cheerPhraseDict.put("SONGDO", "HIGHSCHOOL");
        cheerPhraseDict.put("CODE", "MASTER");
        cheerPhraseDict.put("2023", "0611");
        cheerPhraseDict.put("ALGORITHM", "CONTEST");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(cheerPhraseDict.get(input));
    }
}