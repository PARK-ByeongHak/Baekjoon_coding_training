import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Read the newline after n

        for (int i = 0; i < n; i++) {
            String bef = scanner.nextLine();
            String aft = scanner.nextLine();

            int size = bef.length();
            for (int j = 0; j < size; j++) {
                if (bef.charAt(j) == ' ') {
                    System.out.print(" ");
                } else {
                    System.out.print(aft.charAt(bef.charAt(j) - 'A'));
                }
            }
            System.out.println();
        }
    }
}