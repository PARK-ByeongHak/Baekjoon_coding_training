import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // 증가하는 부분 수열의 길이를 저장할 배열
        int[] inc = new int[N];
        // 감소하는 부분 수열의 길이를 저장할 배열
        int[] dec = new int[N];
        
        // 증가하는 부분 수열의 최대 길이를 구함
        for (int i = 0; i < N; i++) {
            inc[i] = 1; // 자기 자신만으로 수열을 이룰 수 있으므로 1로 초기화
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && inc[i] < inc[j] + 1) {
                    inc[i] = inc[j] + 1;
                }
            }
        }
        
        // 감소하는 부분 수열의 최대 길이를 구함
        for (int i = N - 1; i >= 0; i--) {
            dec[i] = 1; // 자기 자신만으로 수열을 이룰 수 있으므로 1로 초기화
            for (int j = N - 1; j > i; j--) {
                if (A[j] < A[i] && dec[i] < dec[j] + 1) {
                    dec[i] = dec[j] + 1;
                }
            }
        }
        
        // 바이토닉 수열의 최대 길이를 구함
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (max < inc[i] + dec[i] - 1) {
                max = inc[i] + dec[i] - 1;
            }
        }
        
        System.out.println(max);
        sc.close();
    }
}
