import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        
        int result = ((M - 1) + (K - 3) % N + N) % N + 1;
        
        System.out.println(result);
    }
}
