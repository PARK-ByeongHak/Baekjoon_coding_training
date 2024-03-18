import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = sc.nextInt();
        }

        int minLength = Integer.MAX_VALUE;
        int start = 0, end = 0, sum = 0;

        while (true) {
            if (sum >= S) {
                minLength = Math.min(minLength, end - start);
                sum -= sequence[start++];
            } else if (end == N) {
                break;
            } else {
                sum += sequence[end++];
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
        sc.close();
    }
}
