import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int firstTerm = scanner.nextInt();
            int difference = scanner.nextInt();
            int value = scanner.nextInt();

            if (firstTerm == 0 && difference == 0 && value == 0) {
                break;
            }

            if (difference == 0) {
                if (firstTerm == value) {
                    System.out.println("1");
                } else {
                    System.out.println("X");
                }
            } else {
                int term = 1 + (value - firstTerm) / difference;
                int sequenceValue = firstTerm + (term - 1) * difference;
                if (sequenceValue == value && term > 0) {
                    System.out.println(term);
                } else {
                    System.out.println("X");
                }
            }
        }
    }
}
