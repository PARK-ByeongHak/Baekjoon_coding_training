import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger N = scanner.nextBigInteger();
        BigInteger two = new BigInteger("2");
        int K = 64;

        while (N.mod(two).equals(BigInteger.ZERO)) {
            N = N.divide(two);
            K--;
        }

        System.out.println(K);
    }
}
