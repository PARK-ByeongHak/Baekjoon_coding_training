import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        for (int i = 0; i < T; i++) {
            String year = scanner.nextLine().trim();
            String num = year.substring(2, 4);
            
            if ((Integer.parseInt(year) + 1) % Integer.parseInt(num) == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Bye");
            }
        }
    }
}
