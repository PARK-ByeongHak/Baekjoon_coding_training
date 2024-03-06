import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int P = scanner.nextInt();

        List<Integer> bread = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            bread.add(scanner.nextInt());
        }

        List<List<Integer>> bundle = new ArrayList<>();
        for (int i = 0; i < (bread.size() + K - 1) / K; i++) {
            int start = i * K;
            int end = Math.min((i + 1) * K, bread.size());
            bundle.add(bread.subList(start, end));
        }

        int result = N;
        for (List<Integer> b : bundle) {
            int count = 0;
            for (int value : b) {
                if (value == 0) {
                    count++;
                }
            }
            if (count >= P) {
                result--;
            }
        }

        System.out.println(result);
    }
}
