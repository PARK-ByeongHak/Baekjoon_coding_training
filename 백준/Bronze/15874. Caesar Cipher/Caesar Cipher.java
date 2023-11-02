import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c - 'a' + k) % 26);
            } else if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c - 'A' + k) % 26);
            }
            result.append(c);
        }
        
        System.out.println(result.toString());
    }
}
