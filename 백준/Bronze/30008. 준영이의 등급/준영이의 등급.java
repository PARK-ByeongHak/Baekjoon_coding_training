import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] G = new int[K];
        for (int i = 0; i < K; i++) {
            G[i] = scanner.nextInt();
        }
        
        int[] D = new int[K];
        for (int i = 0; i < K; i++) {
            int P = (G[i] * 100) / N;
            if (0 <= P && P <= 4) {
                D[i] = 1;
            } else if (4 < P && P <= 11) {
                D[i] = 2;
            } else if (11 < P && P <= 23) {
                D[i] = 3;
            } else if (23 < P && P <= 40) {
                D[i] = 4;
            } else if (40 < P && P <= 60) {
                D[i] = 5;
            } else if (60 < P && P <= 77) {
                D[i] = 6;
            } else if (77 < P && P <= 89) {
                D[i] = 7;
            } else if (89 < P && P <= 96) {
                D[i] = 8;
            } else if (96 < P && P <= 100) {
                D[i] = 9;
            }
        }
        
        for (int i = 0; i < K; i++) {
            System.out.print(D[i]);
            if (i < K - 1) {
                System.out.print(" ");
            }
        }
    }
}
