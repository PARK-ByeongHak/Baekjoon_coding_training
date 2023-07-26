import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        BigDecimal result = BigDecimal.ONE.divide(BigDecimal.valueOf(2).pow(N), N, RoundingMode.DOWN);
        System.out.println(result.stripTrailingZeros().toPlainString());
        
        scanner.close();
    }
}
