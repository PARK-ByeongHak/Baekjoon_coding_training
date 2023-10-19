import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int totalCubes = 0;
        for (int i = 1; i <= N; i++) {
            totalCubes += i * i * i;
        }

        System.out.println(totalCubes);
    }
}
