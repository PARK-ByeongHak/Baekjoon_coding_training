import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int budget, amount, result;
            char op;
            budget = scanner.nextInt();
            op = scanner.next().charAt(0);
            amount = scanner.nextInt();
            if (budget == 0 && op == 'W' && amount == 0) {
                break;
            }
            if (op == 'W') {
                result = budget - amount;
            } else {
                result = budget + amount;
            }
            if (result < -200) {
                System.out.println("Not allowed");
            } else {
                System.out.println(result);
            }
        }
        scanner.close();
    }
}
