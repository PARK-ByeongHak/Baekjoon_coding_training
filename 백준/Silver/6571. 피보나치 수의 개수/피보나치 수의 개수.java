import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();

            if (a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)) {
                break;
            }

            BigInteger fibo1 = BigInteger.ONE;
            BigInteger fibo2 = BigInteger.valueOf(2);

            int count = 0;

            while (fibo1.compareTo(b) <= 0) {
                if (fibo1.compareTo(a) >= 0) {
                    count++;
                }

                BigInteger temp = fibo2;
                fibo2 = fibo2.add(fibo1);
                fibo1 = temp;
            }

            System.out.println(count);
        }
    }
}
