import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 입력으로 주어진 N
        
        // 1부터 N까지의 합 계산
        int sum = calculateSum(N);
        // 합의 제곱 계산
        int sumSquared = sum * sum;
        // 1부터 N까지의 수의 세제곱의 합 계산
        int sumCubed = calculateSumCubed(N);
        
        // 계산 결과 출력
        System.out.println(sum);
        System.out.println(sumSquared);
        System.out.println(sumCubed);
        
        scanner.close();
    }
    
    // 1부터 N까지의 합을 계산하는 함수
    private static int calculateSum(int N) {
        return N * (N + 1) / 2;
    }
    
    // 1부터 N까지의 수의 세제곱의 합을 계산하는 함수
    private static int calculateSumCubed(int N) {
        int sumCubed = 0;
        for (int i = 1; i <= N; i++) {
            sumCubed += i * i * i;
        }
        return sumCubed;
    }
}
