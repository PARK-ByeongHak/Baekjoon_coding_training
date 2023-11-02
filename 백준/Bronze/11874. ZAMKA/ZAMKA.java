import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int D = scanner.nextInt();
        int X = scanner.nextInt();

        int smallest = findSmallest(L, D, X);
        int largest = findLargest(L, D, X);

        System.out.println(smallest);
        System.out.println(largest);
    }

    public static int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int findSmallest(int L, int D, int X) {
        for (int i = L; i <= D; i++) {
            if (getSum(i) == X) {
                return i;
            }
        }
        return -1; // If no such number is found
    }

    public static int findLargest(int L, int D, int X) {
        for (int i = D; i >= L; i--) {
            if (getSum(i) == X) {
                return i;
            }
        }
        return -1; // If no such number is found
    }
}

