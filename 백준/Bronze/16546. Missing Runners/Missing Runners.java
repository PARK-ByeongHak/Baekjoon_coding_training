import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        HashSet<Integer> runners = new HashSet<>();

        // N - 1 runners who have finished
        for (int i = 0; i < N - 1; i++) {
            int runnerNumber = scanner.nextInt();
            runners.add(runnerNumber);
        }

        // Find the missing runner
        int missingRunner = 0;
        for (int i = 1; i <= N; i++) {
            if (!runners.contains(i)) {
                missingRunner = i;
                break;
            }
        }

        System.out.println(missingRunner);

        scanner.close();
    }
}
