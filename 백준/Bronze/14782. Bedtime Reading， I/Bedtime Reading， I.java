import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();

        int divisorSum = calculateDivisorSum(I);

        System.out.println(divisorSum);
    }

    public static int calculateDivisorSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
