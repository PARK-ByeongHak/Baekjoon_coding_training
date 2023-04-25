import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            String result = "";
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (ch == 'e') {
                    result += 'i';
                } else if (ch == 'i') {
                    result += 'e';
                } else if (ch == 'E') {
                    result += 'I';
                } else if (ch == 'I') {
                    result += 'E';
                } else {
                    result += ch;
                }
            }
            System.out.println(result);
        }
    }
}