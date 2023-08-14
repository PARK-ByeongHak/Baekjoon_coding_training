import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int H = scanner.nextInt(); // 총 핫도그 소비량
            int P = scanner.nextInt(); // 참가자 수
            
            double average = calculateAverage(H, P); // 평균 핫도그 소비량 계산
            System.out.printf("%.2f%n", average); // 소수점 아래 두 자리까지 출력
        }
        
        scanner.close();
    }
    
    // 평균 핫도그 소비량을 계산하는 함수
    private static double calculateAverage(int H, int P) {
        return (double) H / P;
    }
}
