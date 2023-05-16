import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int C = scanner.nextInt();  // 와인을 모은 년수
        int K = scanner.nextInt();  // 고려대 애착 정도
        int P = scanner.nextInt();  // 구매중독 정도
        
        int totalWine = 0;  // 수빈이가 수집한 총 와인 수
        
        for (int year = 0; year <= C; year++) {
            int wineAmount = K * year + P * year * year;  // 해당 년도에 구매한 와인 수
            totalWine += wineAmount;
        }
        
        System.out.println(totalWine);
    }
}