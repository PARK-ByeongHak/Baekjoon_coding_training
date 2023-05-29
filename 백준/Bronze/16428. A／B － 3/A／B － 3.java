import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        if (A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == -1) {
            System.out.println((A.divide(B)).add(BigInteger.ONE));
            System.out.println((A.remainder(B)).subtract(B));
        } else if (A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == 1) {
            System.out.println((A.divide(B)).subtract(BigInteger.ONE));
            System.out.println((A.remainder(B)).add(B));
        } else {
            System.out.println(A.divide(B));
            System.out.println(A.remainder(B));
        }
    }
}
