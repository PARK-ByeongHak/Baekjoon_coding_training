import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int M = scanner.nextInt(); // 신호의 행 개수
        int N = scanner.nextInt(); // 신호의 열 개수
        int K = scanner.nextInt(); // 확대 배율
        
        // 신호 입력 받기
        char[][] signal = new char[M][N];
        for (int i = 0; i < M; i++) {
            String line = scanner.next();
            for (int j = 0; j < N; j++) {
                signal[i][j] = line.charAt(j);
            }
        }
        
        // 확대된 신호 출력
        printEnlargedSignal(signal, M, N, K);
        
        scanner.close();
    }
    
    // 확대된 신호를 출력하는 함수
    private static void printEnlargedSignal(char[][] signal, int M, int N, int K) {
        for (int i = 0; i < M; i++) {
            for (int k = 0; k < K; k++) { // 행을 K번 반복 출력
                for (int j = 0; j < N; j++) {
                    for (int l = 0; l < K; l++) { // 열을 K번 반복 출력
                        System.out.print(signal[i][j]);
                    }
                }
                System.out.println(); // 행 끝날 때마다 개행
            }
        }
    }
}
