import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();  // 대회 개수
        int[] prizes = new int[n];  // 대회별 상금 배열
        
        // 대회별 상금 입력
        for (int i = 0; i < n; i++) {
            prizes[i] = scanner.nextInt();
        }
        
        // 모든 상금의 합을 구함
        int totalPrize = 0;
        for (int prize : prizes) {
            totalPrize += prize;
        }
        
        // 세 명의 팀원에게 공평하게 나눠줄 수 있는지 확인
        if (totalPrize % 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        scanner.close();
    }
}
