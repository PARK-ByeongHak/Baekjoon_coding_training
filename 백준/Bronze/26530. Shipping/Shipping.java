import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 각 데이터 세트에 대해 처리
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            double total = 0;

            // 각 아이템에 대해 처리
            for (int j = 0; j < x; j++) {
                String name = sc.next();
                int quantity = sc.nextInt();
                double unitPrice = sc.nextDouble();
                total += quantity * unitPrice;  // 수량과 단가를 곱하여 합산
            }

            System.out.printf("$%.2f\n", total);  // 소수점 2자리까지 출력
        }
    }
}
