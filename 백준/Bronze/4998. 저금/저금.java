import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            double N = scanner.nextDouble(); // 초기 저금액
            double B = scanner.nextDouble(); // 이자율
            double M = scanner.nextDouble(); // 목표 금액
            
            int years = calculateYears(N, B, M); // 몇 년이 지나야 목표 금액을 넘을 수 있는지 계산
            System.out.println(years);
        }
        
        scanner.close();
    }
    
    // 몇 년이 지나야 목표 금액을 넘을 수 있는지 계산하는 함수
    private static int calculateYears(double N, double B, double M) {
        int years = 0;
        while (N < M) {
            N += N * (B / 100.0); // 이자를 계산하여 저금액에 추가
            years++;
        }
        return years;
    }
}
