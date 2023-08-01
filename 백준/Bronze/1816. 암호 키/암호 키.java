import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final int MAX = 1000001;
    static int[] minFactor = new int[MAX];
    static ArrayList<Integer> prime = new ArrayList<>();

    static void eratosthenes() {
        for (int i = 2; i < MAX; i++) {
            minFactor[i] = i;
        }

        for (int i = 2; i * i < MAX; i++) {
            if (minFactor[i] == i) {
                for (int j = i * i; j < MAX; j += i) {
                    if (minFactor[j] == j) {
                        minFactor[j] = i;
                    }
                }
            }
        }

        for (int i = 2; i < MAX; i++) {
            if (minFactor[i] == i) {
                prime.add(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        eratosthenes();

        for (int n = 0; n < N; n++) {
            long S = scanner.nextLong();

            boolean flag = true;

            for (int i = 0; i < prime.size(); i++) {
                if (S % prime.get(i) == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
