import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        sc.close();

        Arrays.sort(A);
        int answer = 1;
        for (int i = 0; i < N; i++) {
            if (answer != A[i]) break; // 다르다면 중지
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    i = j;
                } else {
                    break;
                }
            }
            answer++;
        }
        System.out.println(answer);
    }
}
