import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        long result = calculateProductModulo(numbers, M);
        System.out.println(result);

        sc.close();
    }

    private static long calculateProductModulo(int[] numbers, long M) {
        long result = 1;
        for (int num : numbers) {
            result = (result * num) % M;
        }
        return result;
    }
}
