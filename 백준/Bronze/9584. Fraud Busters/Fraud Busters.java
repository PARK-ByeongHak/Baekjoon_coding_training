import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scannerCode = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        List<String> databaseCodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String databaseCode = scanner.nextLine();
            if (matchesCodes(scannerCode, databaseCode)) {
                databaseCodes.add(databaseCode);
            }
        }

        System.out.println(databaseCodes.size());
        for (String code : databaseCodes) {
            System.out.println(code);
        }
    }

    public static boolean matchesCodes(String scannerCode, String databaseCode) {
        if (scannerCode.length() != databaseCode.length()) {
            return false;
        }

        for (int i = 0; i < scannerCode.length(); i++) {
            char scannerChar = scannerCode.charAt(i);
            char databaseChar = databaseCode.charAt(i);
            if (scannerChar != databaseChar && scannerChar != '*') {
                return false;
            }
        }

        return true;
    }
}
