import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        
        int[] A = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            sum += A[i];
        }
        
        if (sum % X == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
