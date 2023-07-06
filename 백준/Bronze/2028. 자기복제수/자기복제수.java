import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String stringN = Integer.toString(n);
            String stringSquare = Integer.toString(n * n);
            if (stringSquare.indexOf(stringN) == stringSquare.length() - stringN.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}