import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 수 입력 받기
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            // 층과 호수 입력 받기
            int k = sc.nextInt(); // 층 수
            int n = sc.nextInt(); // 호수 수
            
            // 거주민 수 계산 및 출력
            int residents = calculateResidents(k, n);
            System.out.println(residents);
        }
    }
    
    // 거주민 수를 계산하는 함수
    public static int calculateResidents(int k, int n) {
        // 0층의 경우 해당 호수의 값이 거주민 수
        if (k == 0) {
            return n;
        }
        
        // k층의 n호 거주민 수 = (k-1)층의 1호부터 n호까지 거주민 수의 합
        // 이를 재귀적으로 계산
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += calculateResidents(k - 1, i);
        }
        
        return sum;
    }
}
